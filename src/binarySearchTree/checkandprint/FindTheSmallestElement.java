package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class FindTheSmallestElement {
    public static  void main(String [] args){
        BSTree node =BSTCreator.getBST();
        System.out.println(getMin(node));
    }
    public static int getMin(BSTree node){
        if(node==null){
            return Integer.MAX_VALUE;
        }
        while(node.left!=null){
            node = node.left;
        }
        return node.data;
    }
}
