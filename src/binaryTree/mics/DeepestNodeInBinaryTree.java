package binaryTree.mics;

import binaryTree.introduction.Btree;

public class DeepestNodeInBinaryTree {

    public static int maxlevel = Integer.MIN_VALUE;
    public static void main(String [] ahrs){
        Btree node = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(node, 2);
        Btree.insertNewNodeLevelOder(node, 3);
        Btree.insertNewNodeLevelOder(node, 4);
        Btree.insertNewNodeLevelOder(node, 5);
        Btree.insertNewNodeLevelOder(node, 6);
        Btree.insertNewNodeLevelOder(node, 7);
        Btree.insertNewNodeLevelOder(node, 8);
        Btree.insertNewNodeLevelOder(node, 9);
        getDeepestNode(node, 1);
        System.out.print(maxlevel);
    }

    public static void getDeepestNode(Btree node, int level){
        if(node==null)
            return ;
        getDeepestNode(node.left, level+1);
        if(level>maxlevel)
            maxlevel = level;
        getDeepestNode(node.right, level+1);

    }

}
