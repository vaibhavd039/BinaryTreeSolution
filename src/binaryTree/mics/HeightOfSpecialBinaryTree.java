package binaryTree.mics;

import binaryTree.introduction.Btree;

public class HeightOfSpecialBinaryTree {
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
        System.out.print(findHeight(root));
    }

    public static int findHeight(Btree node) {
        if (node == null)
            return 0;
        if (isLeaf(node))
            return 1;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }

    public static boolean isLeaf(Btree node) {
        return (node.left == null && node.right == null) || (node.left != null && node.left.right == node) || (node.right != null && node.right.left == node);
    }

}
