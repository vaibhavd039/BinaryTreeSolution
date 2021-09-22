package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class CheckDeadNodes {
    public static void main(String [] args){
        BSTree node = BSTCreator.getBST();
        BSTree.levelOrderTraversal(node);
        System.out.println(doesContainDeadNode(node));
    }
    
    private static boolean doesContainDeadNode(BSTree node){
        return isDeadNode(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isDeadNode(BSTree node , int min , int max){
        if(node==null)
            return false;
        if(min==max)
            return true;
        return  isDeadNode(node.left, min , node.data-1) || isDeadNode(node.right, node.data+1 , max);
    }
    
}
