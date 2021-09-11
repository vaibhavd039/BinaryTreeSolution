package binarySearchTree.checkandprint;
//Given values of two values n1 and n2 in a Binary Search Tree,
// find the Lowest Common Ancestor (LCA). You may assume that both the values exist in the tree.

import binarySearchTree.basics.BSTree;
import binaryTree.introduction.Btree;

public class LCABST {
    public static void main(String [] args){
        BSTree node = BSTCreator.getBST();
        BSTree.levelOrderTraversal(node);
        System.out.println(findLCA(node, 6, 9));
        
    }
    public static int findLCA(BSTree node, int data1, int data2){
        if(node==null){
            return Integer.MAX_VALUE;
        }
        if(node.data <data1 && node.data <data2){
            return findLCA(node.right, data1, data2);
        }
        else if(node.data > data1 && node.data >data2){
            return findLCA(node.left, data1, data2);
        } else if( (node.data<=data1 && node.data >=data2) || (node.data>=data1 && node.data <=data2)){
            return node.data;
        }
        return  Integer.MAX_VALUE;
    }
    
}
