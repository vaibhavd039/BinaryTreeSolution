package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

//Given a Binary Tree, find if there exists an edge whose removal creates two trees of equal size.
public class TwoHalves {
    public static int total = 0;
    public static boolean ispossible = false;
    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);
        Btree.insertNewNodeLevelOder(root1, 7);
        Btree.insertNewNodeLevelOder(root1, 8);
        Btree.insertNewNodeLevelOder(root1, 9);
        Btree.insertNewNodeLevelOder(root1, 10);
        Btree.insertNewNodeLevelOder(root1, 11);
        Btree.insertNewNodeLevelOder(root1, 12);
        Btree.insertNewNodeLevelOder(root1, 13);
        Btree.insertNewNodeLevelOder(root1, 14);
        Btree.insertNewNodeLevelOder(root1, 15);
        Btree.insertNewNodeLevelOder(root1, 16);
        total = getSize(root1);
        checkRec(root1);
        System.out.println(ispossible);

    }

    public static int checkRec(Btree node) {
        if (node == null)
            return 0;
        int count = checkRec(node.left) +1+checkRec(node.right);
        if(count *2 == total)
            ispossible =true;
        return count;
    }

    public static int getSize(Btree node) {
        if (node == null)
            return 0;
        return getSize(node.left) + 1 + getSize(node.right);
    }
}
