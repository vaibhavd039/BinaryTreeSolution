package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class SumOfGreaterNubmber {
    public static int sum =0;
    public static void main(String[] args) {
        BSTree root = BSTCreator.getBST();
        doGreaterSearch(root);
        BSTree.levelOrderTraversal(root);
    }
    public static  void doGreaterSearch(BSTree node){
        if(node ==null)
            return;
        doGreaterSearch(node.right);
        sum+=node.data;
        node.data = sum;
        doGreaterSearch(node.left);
    }
    
}
