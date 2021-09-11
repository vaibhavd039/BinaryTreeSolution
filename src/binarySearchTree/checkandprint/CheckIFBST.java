package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class CheckIFBST {
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
//        BSTree.levelOrderTraversal(node);
        System.out.println(isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    
    public static boolean isBST(BSTree node, int min, int max) {
        if (node == null)
            return true;
        return (node.data >= min && node.data <= max) && isBST(node.left, min, node.data) && isBST(node.right, node.data, max);
        
    }
    
}
