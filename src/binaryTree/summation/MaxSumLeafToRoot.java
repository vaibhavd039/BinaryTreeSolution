package binaryTree.summation;
/*
Given a Binary Tree, find the maximum sum path from a leaf to root.
For example, in the following tree, there are three leaf to root paths 8->-2->10, -4->-2->10 and 7->10.
The sums of these three paths are 16, 4 and 17 respectively. The maximum of them is 17 and the path for maximum is 7->10.
*/

import binaryTree.introduction.Btree;

public class MaxSumLeafToRoot {
    static  int maxSum= 0;
    static Btree leafNode;
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
        Btree.insertNewNodeLevelOder(root, 16);
        findTheNodeWithMaxSum(root, 0);
        printPath(root);
        System.out.println("sum= "+maxSum+" btree="+leafNode.data);
    }

    public static void findTheNodeWithMaxSum(Btree root, int sum){
        if(root ==null)
            return ;
        sum += root.data;
        if(sum >maxSum && root.left ==null && root.right==null) {
            maxSum = sum;
            leafNode = root;
        }
        if(root.left!=null){
            findTheNodeWithMaxSum(root.left, sum);
        }
        if(root.right!=null){
            findTheNodeWithMaxSum(root.right, sum);
        }
        sum -=root.data;
    }

    public static  boolean printPath(Btree root){
        if(root==null)
            return false;
        if(root==leafNode || printPath(root.left) || printPath(root.right)){
            System.out.println(root.data);
            return true;
        }
        return false;
    }

}
