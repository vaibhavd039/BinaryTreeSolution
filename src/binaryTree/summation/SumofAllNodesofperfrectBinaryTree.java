package binaryTree.summation;
//Given a positive integer L which represents the number of levels in a perfect binary tree.
// Given that the leaf nodes in this perfect binary tree are numbered starting from 1 to n, where n is the number of leaf nodes

import binaryTree.introduction.Btree;

public class SumofAllNodesofperfrectBinaryTree {
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
        System.out.print(getSum(6));
    }
    public static  double getSum(int l){
        double leadNodeCount = Math.pow(2, l-1);
        double sumLastLevel =0;
        sumLastLevel = (leadNodeCount*(leadNodeCount+1))/2;
        double sum = sumLastLevel * l;
        return sum;
    }
}
