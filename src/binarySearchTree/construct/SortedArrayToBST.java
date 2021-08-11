package binarySearchTree.construct;

//Given a sorted array. Write a function that creates a Balanced Binary Search Tree using array elements.

import binarySearchTree.basics.BSTree;

public class SortedArrayToBST {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,5,6,7,8,9,10};
        int n = arr.length;
        BSTree node = createTree(arr, 0 , arr.length-1);
        BSTree.inOrderTraversal(node);
        System.out.println("");
        BSTree.levelOrderTraversal(node);
    }
    public static  BSTree createTree(int [] arr , int start, int end){
        if(start>end)
            return null;
        int x = (start+end)/2;
        BSTree root = new BSTree(arr[x]);
        root.left = createTree(arr, start, x-1);
        root.right = createTree(arr, x+1, end);
        return root;
    }
}
