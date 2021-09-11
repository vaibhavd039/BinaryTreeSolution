package binarySearchTree.checkandprint;

//Given Preorder traversal of a BST,
// check if each non-leaf node has only one child. Assume that the BST contains unique entries.

import binarySearchTree.basics.BSTree;

public class CheckIfEachNodeHasOneChild {
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
        BSTree.preOrderTraversal(node);
        
        int[] preoder = {5, 3, 1, 2, 4, 8, 6, 7, 9, 10};
        System.out.println(checkIfAllHasOnlyChild(preoder));
    }
    
    public static boolean checkIfAllHasOnlyChild(int[] pre) {
        int a = pre[pre.length-1];
        int b = pre[pre.length-2];
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        for(int i = pre.length-3;i>=0;i--){
            int x = pre[i];
            if(x<min){
                min = x;
            } else if(x>max){
                max = x;
            } else {
                return false;
            }
        }
        return true;
    }
    
}
