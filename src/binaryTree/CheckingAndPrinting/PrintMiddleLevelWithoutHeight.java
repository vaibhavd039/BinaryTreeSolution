package binaryTree.CheckingAndPrinting;
/*
Given a perfect binary tree, print nodes of middle level without computing its height.
A perfect binary tree is a binary tree in which all interior nodes have two children and all leaves have the same depth or same level.*/

import binaryTree.introduction.Btree;

public class PrintMiddleLevelWithoutHeight {

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
        printMiddleLevelWithoutHeight(root1, root1);
    }

    public static void printMiddleLevelWithoutHeight(Btree node, Btree fast) {
        if (node == null || fast==null)
            return;
        if (fast.left == null && fast.right == null) {
            System.out.print(node.data + "\t");
            return;
        }
        if(fast.left.left!=null){
            printMiddleLevelWithoutHeight(node.left, fast.left.left);
            printMiddleLevelWithoutHeight(node.right, fast.left.left);
        } else {
            printMiddleLevelWithoutHeight(node.left, fast.left);
            printMiddleLevelWithoutHeight(node.right, fast.left);
        }
    }
}
