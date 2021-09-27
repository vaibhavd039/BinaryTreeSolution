package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class ClosetsNumber {
    static  int min_diff= Integer.MAX_VALUE;
    static int diff_key = Integer.MIN_VALUE;
    public static void main(String[] args) {
        BSTree root = BSTCreator.getBST();
        findClosests(root, 4);
        System.out.println(diff_key+" "+min_diff);
    }
    public static void findClosests(BSTree node , int key){
        if(node == null){
            return;
        }
        if(node.data==key){
            min_diff =0;
            diff_key= node.data;
        }
        if (Math.abs(node.data-key) <min_diff){
            min_diff = Math.abs(node.data-key);
            diff_key = node.data;
        }
        if(node.data>key){
            findClosests(node.left, key);
        } else {
            findClosests(node.right, key);
        }
    
    }
}
