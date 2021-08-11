package binaryTree.summation;
//Given a root node to a tree, find the sum of all the leaf nodes which are at maximum depth from root node.

import binaryTree.introduction.Btree;

public class SumofMaxDepthNodes {
    public static int maxLevel = -1;
    public static  int sum = 0;
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
        Btree.insertNewNodeLevelOder(root, 16);
        getSumAtMaxDepth(root, 0);
        System.out.println(sum);
    }

    public static void getSumAtMaxDepth(Btree root, int level){
        if(root ==null)
            return;
        if(level>maxLevel){
        sum = root.data;
        maxLevel = level;
        }
        if(level == maxLevel){
            sum +=root.data;
        }
        getSumAtMaxDepth(root.left , level+1);
        getSumAtMaxDepth(root.right, level+1);
    }


}
