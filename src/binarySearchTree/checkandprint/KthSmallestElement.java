package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class KthSmallestElement {
    static int k;
    static int counter;
    public static void main(String [] arhs){
        counter= 0;
        k =8;
        BSTree node = BSTCreator.getBST();
        System.out.println(getKthSmallestElement(node).data);
    }
    public static BSTree getKthSmallestElement(BSTree node){
        if(node == null)
            return null;
      BSTree left =   getKthSmallestElement(node.left);
         if(left != null)
             return left;
         counter++;
         if(counter ==k)
             return node;
         return getKthSmallestElement(node.right);
    }
}
