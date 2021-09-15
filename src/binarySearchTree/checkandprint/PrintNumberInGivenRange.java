package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class PrintNumberInGivenRange {
    public static void main(String [] args){
        BSTree node = BSTCreator.getBST();
        BSTree.levelOrderTraversal(node);
        printNumberinRange(node, 4,8);
    }
    
    public static  void printNumberinRange(BSTree node, int min, int max){
        if(node ==null)
            return;
        if(node.data >= min && node.data <= max){
            System.out.println(node.data);
            printNumberinRange(node.left, min, max);
            printNumberinRange(node.right, min, max);
        }
       else  if(node.data> max){
            printNumberinRange(node.left, min, max);
        }
    
        if(node.data< min){
            printNumberinRange(node.right, min, max);
        }
    }
}
