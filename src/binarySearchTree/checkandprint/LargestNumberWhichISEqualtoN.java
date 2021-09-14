package binarySearchTree.checkandprint;
//We have a binary search tree and a number N. Our task is to find the greatest number
// in the binary search tree that is less than or equal to N.
// Print the value of the element if it exists otherwise print -1.

import binarySearchTree.basics.BSTree;

public class LargestNumberWhichISEqualtoN {
    public static void main(String [] args){
        BSTree node = BSTCreator.getBST();
      System.out.println(  findLargestLessThanN(node , 5));
        
    }
    public static int findLargestLessThanN(BSTree node , int N){
        if(node == null)
            return -1;
        int left_data = node.left !=null ? node.left.data: Integer.MIN_VALUE;
        int right_data = node.right !=null ? node.right.data: Integer.MAX_VALUE;
    
        if(node.data <=N && left_data < N && right_data > N){
            return node.data;
        }
        if(node.data> N){
            return findLargestLessThanN(node.right, N);
        }
        
        else {
          return   findLargestLessThanN(node.left, N);
        }
    }
}
