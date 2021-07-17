package summation;

import introduction.Btree;

public class LeftLeafSum {
    public static  int sum= 0;
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
        getLeftLeafSum(root);
        System.out.print(sum);
    }

    public static void getLeftLeafSum(Btree node) {
        if (node == null)
            return ;
        if (node.left != null && isLeafNode(node.left)){
            sum+=node.left.data;
        }
        getLeftLeafSum(node.left);
        getLeftLeafSum(node.right);
    }

    public static boolean isLeafNode(Btree node) {
        return node.left == null && node.right == null;
    }

}