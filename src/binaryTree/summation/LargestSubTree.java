package binaryTree.summation;
//Find largest subtree sum in a tree

import binaryTree.introduction.Btree;

public class LargestSubTree {
    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
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
        System.out.println(Math.max(getLargestSubtree(root.left), getLargestSubtree(root.right)));
    }

    public static int getLargestSubtree(Btree node){
        if(node== null)
            return  0;
        return node.data + getLargestSubtree(node.left)+ getLargestSubtree(node.right);
    }


}
