package binarySearchTree.construct;
//Given a binary search tree which is also a complete binary tree.
// The problem is to convert the given BST into a Min Heap with the condition that all the values in the left subtree of a node should be less
// than all the values in the right subtree of the node.
// This condition is applied on all the nodes in the so converted Min Heap.

import binarySearchTree.basics.BSTree;

public class ConvertBSTtoMinHeap {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int n = arr.length;
        BSTree node = SortedArrayToBST.createTree(arr, 0 , arr.length-1);
        BSTree.levelOrderTraversal(node);
    }
    
}
