package binaryTree.introduction;

public class PreOrderWithRIghtNode {
    /*Given a binary tree. Modify it in such a way
     that after modification you can have a preorder traversal of it
     using only the right pointers. During modification,
     you can use right as well as left pointers. */

    public static void main(String[] args) {
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
        root= modifyTree(root);
        while(root!=null){
            System.out.println(root.data);
            root= root.right;
        }
        System.out.println(" ");
    }
    public static Btree modifyTree(Btree node){
        if(node == null)
            return null;
        if(node.left==null && node.right == null)
            return node;
       Btree rightSubtree = modifyTree(node.right);
       Btree lestSubtree =modifyTree(node.left);

       node.right = lestSubtree;
        node.left = null;
       Btree lastNode = getLastNode(lestSubtree);
       lastNode.right = rightSubtree;
       return node;
    }
    public static Btree getLastNode(Btree node){
        if(node == null)
            return null;
        while(node.right!=null){
            node = node.right;
        }
        return  node;
    }


}
