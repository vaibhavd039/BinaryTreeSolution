package binarySearchTree.checkandprint;

//Given a Binary Search Tree (BST) of integer values and a range [low, high],
// return count of nodes where all the nodes under that node (or subtree rooted with that node) lie in the given range.

import binarySearchTree.basics.BSTree;

public class CountSubtreeLiesInRange {
    public static int count = 0;
    public static  void main(String [] args){
    BSTree node = BSTCreator.getBST();
    countSubtreeInRange(node , 0, 10);
    System.out.println(count);
    }
    
    public static boolean countSubtreeInRange(BSTree node , int min , int max){
        if(node==null)
            return true;
        boolean isPositive = countSubtreeInRange(node.left , min, max) && countSubtreeInRange(node.right, min, max) && node.data>min && node.data< max;
        if (isPositive){
            count++;
        }
        return isPositive;
    }
}
