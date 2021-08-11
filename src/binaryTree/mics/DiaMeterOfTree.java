package binaryTree.mics;

import binaryTree.introduction.Btree;

public class DiaMeterOfTree {
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
        System.out.print(getDiameter(root, new Height()));

    }

    public static int getDiameter(Btree node , Height height){
        if(node == null){
            height.h = 0;
            return 0;
        }
        Height lh = new Height();
        Height rh  = new Height();
        int leftDiameter = getDiameter(node.left, lh);
        int rightDiameter = getDiameter(node.right, rh);
        height.h = 1 + Math.max(lh.h, rh.h);
        return  Math.max(lh.h+ rh.h +1, Math.max(leftDiameter, rightDiameter));
    }
}
class Height{
    int h;
}
