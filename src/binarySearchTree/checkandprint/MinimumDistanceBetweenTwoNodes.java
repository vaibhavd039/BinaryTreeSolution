package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class MinimumDistanceBetweenTwoNodes {
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
        BSTree.levelOrderTraversal(node);
        System.out.println(findDistace(node, 1, 9));
        
    }
    
    public static int findDistace(BSTree node, int data1, int data2) {
        BSTree lca = findLCA(node, data1, data2);
        return findDepth(lca, data1) + findDepth(lca, data2);
    }
    
    public static BSTree findLCA(BSTree node, int data1, int data2) {
        if (node == null)
            return null;
        if (node.data >= data1 && node.data <= data2) {
            return node;
        }
        if (node.data < data1 && node.data < data2)
            return findLCA(node.right, data1, data2);
        else
            return findLCA(node.left, data1, data2);
    }
    
    public static int findDepth(BSTree node, int data) {
        if (node.data == data)
            return 0;
        if (node.data < data) {
            return 1 + findDepth(node.right, data);
        } else {
            return 1 + findDepth(node.left, data);
        }
    }
    
    
}
