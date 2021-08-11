package binarySearchTree.construct;

//Given a BST, transform it into a greater sum tree where each node contains sum of all nodes greater than that node.

import binarySearchTree.basics.BSTree;
import binaryTree.introduction.Btree;

public class BSTtoGreaterSumTree {
    static int sum = 0;
    public static void main(String [] args){
            int [] arr = {1, 2, 7, 11, 15, 29, 35, 40};
            int n = arr.length;
            BSTree node = SortedArrayToBST.createTree(arr, 0 , arr.length-1);
            BSTree.inOrderTraversal(node);
            System.out.println("");
            getGreaterTree(node);
            BSTree.inOrderTraversal(node);
        
    }
    
    public static void getGreaterTree(BSTree node){
        if(node == null)
            return;
        getGreaterTree(node.right);
        sum +=node.data;
        node.data = sum -node.data;
        getGreaterTree(node.left);
    }
    
}
