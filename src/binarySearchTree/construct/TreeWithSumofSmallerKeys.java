package binarySearchTree.construct;

import binarySearchTree.basics.BSTree;

//Given a Binary Search Tree(BST), convert it to a Binary Tree such
// that every key of the original BST is changed to key plus sum of all smaller keys in BST.
//Given a BST with N Nodes we have to convert into Binary Tree

public class TreeWithSumofSmallerKeys {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int n = arr.length;
        BSTree node = SortedArrayToBST.createTree(arr, 0 , arr.length-1);
        BSTree.levelOrderTraversal(node);
        System.out.println("");
        getSumOFSmallerKeys(node);
        BSTree.levelOrderTraversal(node);
    }
    
    public static int getSumOFSmallerKeys(BSTree node){
        if(node ==null)
            return 0;
        int left = getSumOFSmallerKeys(node.left);
        int sum = node.data + left;
        node.data = sum;
        int right = getSumOFSmallerKeys(node.right);
        return sum + right;
    }
}
