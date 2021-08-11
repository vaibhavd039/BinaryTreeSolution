package binarySearchTree.construct;

//Given a Binary Tree, convert it to a Binary Search Tree
// . The conversion must be done in such a way that keeps the original structure of Binary Tree.

import binarySearchTree.basics.BSTree;
import binaryTree.introduction.Btree;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeToBST {
    static ArrayList<Integer> arr = new ArrayList<>();
    static int index = 0;

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
        root = createBSTfromBtree(root);
        Btree.inOrderTraverse(root);
    }

    public static Btree createBSTfromBtree(Btree root) {
        if (root == null)
            return null;
        getInOrderArrray(root);
        Collections.sort(arr);
        root = createTreeFromList(root);
        return root;
    }

    public static void getInOrderArrray(Btree root) {
        if (root == null)
            return;
        getInOrderArrray(root.left);
        arr.add(root.data);
        getInOrderArrray(root.right);
    }

    public static Btree createTreeFromList(Btree root) {
        if(root==null)
            return null;
        root.left = createTreeFromList(root.left);
        root = new Btree(arr.get(index));
        index++;
        root.right = createTreeFromList(root.right);
        return root;
    }

}
