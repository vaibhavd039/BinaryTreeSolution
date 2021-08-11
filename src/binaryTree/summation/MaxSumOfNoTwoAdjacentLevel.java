package binaryTree.summation;
//Given a binary tree with positive integer values.
// Find the maximum sum of nodes such that we cannot pick two levels for computing sum

import binaryTree.introduction.Btree;

public class MaxSumOfNoTwoAdjacentLevel {

    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 6);
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
        int levelZero = getTheSum(root);
        int levelOne = getTheSum(root.left) + getTheSum(root.right);
        System.out.println(Math.max(levelOne, levelZero));
    }

    public static int getTheSum(Btree root){
        if(root ==null)
            return  0;
        int sum = root.data;
        if(root.left !=null){
            sum += getTheSum(root.left.left);
            sum += getTheSum(root.left.right);
        }
        if(root.right !=null){
            sum += getTheSum(root.right.left);
            sum += getTheSum(root.right.right);
        }
        return sum;
    }

}
