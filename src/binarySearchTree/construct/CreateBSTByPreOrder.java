package binarySearchTree.construct;
//Given preorder traversal of a binary search tree, construct the BST.

/*We know first element is root element
        We need to implement min-max approach
        INitialize it by INT_MIN and INT_MAX
        Now root will fall in this
        Criteria for left subtree will be INT_MIN to root.data
        Criteria for right subtree will be root.data to INT_MAX
        This will bring O(n) complexity*/

import binarySearchTree.basics.BSTree;

public class CreateBSTByPreOrder {
    static int index = 0;
    static int size = 0;

    public static void main(String[] args) {
        int[] arr = { 10, 5, 1, 7, 40, 50 };
        size = arr.length;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        BSTree root = constructTreeFromPreOrder(arr, arr[0], min, max);
        BSTree.inOrderTraversal(root);
    }

    public static BSTree constructTreeFromPreOrder(int[] arr, int data, int min, int max) {
        if (index > size)
            return null;
        BSTree node = null;
        if (data > min && data < max) {
            node = new BSTree(arr[index]);
            index++;
            if (index < size) {
                node.left = constructTreeFromPreOrder(arr, arr[index], min, node.data);
            }
            if (index < size) {
                node.right = constructTreeFromPreOrder(arr, arr[index], node.data, max);
            }
        }
        return node;
    }

}
