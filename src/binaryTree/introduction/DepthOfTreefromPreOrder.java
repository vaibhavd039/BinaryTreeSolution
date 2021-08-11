package binaryTree.introduction;

public class DepthOfTreefromPreOrder {
    public static void main(String [] args){
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        Btree.insertNewNodeLevelOder(root, 8);
        Btree.insertNewNodeLevelOder(root, 9);
        Btree.insertNewNodeLevelOder(root, 10);
        Btree.insertNewNodeLevelOder(root, 11);
        Btree.insertNewNodeLevelOder(root, 12);
        Btree.insertNewNodeLevelOder(root, 13);
        Btree.insertNewNodeLevelOder(root, 14);
        Btree.insertNewNodeLevelOder(root, 15);
        findDepthOfTree(root);
    }
    public static void findDepthOfTree(Btree root){
        System.out.print(getDepth(root));
    }
    public static int getDepth(Btree node){
        if (node==null || (node.left==null && node.right ==null))
            return  0;
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        return  Math.max(leftDepth, rightDepth) +1;

    }
}
