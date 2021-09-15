package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class RemoveNumberOutSideFromRange {
    public static void main(String [] args){
    BSTree node = BSTCreator.getBST();
    node = removeNodeAfterRange(node, 3, 8);
    BSTree.levelOrderTraversal(node);
    }
    public static BSTree removeNodeAfterRange(BSTree node, int min, int max){
        if(node==null){
            return null;
        }
     node.left= removeNodeAfterRange(node.left, min, max);
        node.right= removeNodeAfterRange(node.right, min, max);
        if(node.data<min){
            BSTree right= node.right;
            node = null;
            return  right;
        }
        if(node.data>max){
            BSTree left = node.left;
            node = null;
            return  left;
        }
        return  node;
    }
    
}
