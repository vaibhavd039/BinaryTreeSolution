package binaryTree.summation;

//Given a binary tree, find if there is a pair in root to a leaf path such that sum of values in pair is equal to root’s data.
// For example, in below tree there are no pairs in any root to leaf path with sum equal to root’s data.

import binaryTree.introduction.Btree;

import java.util.HashSet;
import java.util.Set;

public class PairSumtoRoot {
    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 6);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        Btree.insertNewNodeLevelOder(root, 8);
        Btree.insertNewNodeLevelOder(root, 9);
        Btree.insertNewNodeLevelOder(root, 10);
        Btree.insertNewNodeLevelOder(root, 11);
        Btree.insertNewNodeLevelOder(root, 12);
        Btree.insertNewNodeLevelOder(root, 13);
        Btree.insertNewNodeLevelOder(root, 14);
        Btree.insertNewNodeLevelOder(root, 15);
        System.out.print(isPairAvailable(root));
    }
    public static boolean isPairAvailable(Btree root){
        if(root==null)
            return false;
        Set<Integer> myset = new HashSet<>();
       return checkForRootToLeafPair(root.left, root.data, myset) || checkForRootToLeafPair(root.right  , root.data , myset);
    }

    public static  boolean checkForRootToLeafPair(Btree node, int root_data , Set<Integer> myset){
        if(node==null)
            return  false;
        int rem = root_data - node.data;
        if(myset.contains(rem)){
            return true;
        }
        myset.add(node.data);
        boolean result =  checkForRootToLeafPair(node.left, root_data, myset) || checkForRootToLeafPair(node.right, root_data,myset);
        myset.remove(node.data);
        return result;
    }
}
