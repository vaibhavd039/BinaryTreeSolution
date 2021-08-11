package binarySearchTree.construct;

import binarySearchTree.basics.BSTree;

public class SumTree {
    static int sum = 0;
    public static void main(String [] args){
        int [] arr = {1, 2, 7, 11, 15, 29, 35, 40};
        int n = arr.length;
        BSTree node = SortedArrayToBST.createTree(arr, 0 , arr.length-1);
        BSTree.inOrderTraversal(node);
        System.out.println("");
        sumTree(node);
        BSTree.inOrderTraversal(node);
    }
    
    public static void sumTree(BSTree node){
        if(node == null)
            return;
        sumTree(node.right);
        sum+= node.data;
        node.data= sum;
        sumTree(node.left);
    }
    
}
