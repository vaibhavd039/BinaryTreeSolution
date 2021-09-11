package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class CheckIfSubsequenceExists {
    static int index = 0;
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
        int [] arr = {3,4,5,6};
        ifExists(node, arr);
        System.out.println(index  == arr.length);
    }
    
    public static void ifExists(BSTree node, int [] arr){
        if(node == null)
            return ;
        if(index==arr.length){
            return;
        }
        ifExists(node.left, arr);
        if(node.data==arr[index]){
            index++;
        }
        ifExists(node.right, arr);
    }
    
}
