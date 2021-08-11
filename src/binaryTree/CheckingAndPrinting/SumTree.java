package binaryTree.CheckingAndPrinting;
/*Write a function that returns true if the given Binary Tree is SumTree else false.
 A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes present in its left subtree and right subtree*/

import binaryTree.introduction.Btree;

public class SumTree {
    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 16);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.levelOrderTraversal(root);
        System.out.print(checkIfSumTree(root));
    }
    public static boolean checkIfSumTree(Btree node){
        if(node == null)
            return true;
        if(node.left==null && node.right == null)
            return true;
        int leftsum = getSum(node.left);
        int rightSum = getSum(node.right);
        return (node.data == leftsum + rightSum) && checkIfSumTree(node.left) && checkIfSumTree(node.right);
    }
    public static int getSum(Btree node){
        if(node == null)
            return 0;
        return getSum(node.left) + node.data + getSum(node.right);
    }


}
