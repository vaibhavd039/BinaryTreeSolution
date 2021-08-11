package binaryTree.mics;

import binaryTree.introduction.Btree;

public class MaxDepthorHeightOfTree {
    static int maxHeight = Integer.MIN_VALUE;
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
        Btree.insertNewNodeLevelOder(root, 15);
        Btree.insertNewNodeLevelOder(root, 15);
        getHeightOfTree(root);
        System.out.print(maxHeight);

    }

    public static  int getHeightOfTree(Btree node){
        if(node == null)
            return 0;
        int height = 1 + Math.max(getHeightOfTree(node.left) , getHeightOfTree(node.right));
        if(height>maxHeight)
            maxHeight = height;
        return height;
    }
}
