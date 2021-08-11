package binaryTree.CheckingAndPrinting;
//Given a binary tree and an array, the task is to find if the given array
// sequence is present as a root to leaf path in given tree.

import binaryTree.introduction.Btree;

public class CheckPathExistance {

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
        int [] path = {1,3,7,15};
        System.out.println(checkIfPathExists(root, path, 0));
    }

    public static boolean checkIfPathExists(Btree node, int[]arr, int index){
        if(node==null && index< arr.length)
            return false;
        if(node.left ==null && node.right==null){
            if(index==arr.length-1 && node.data==arr[index])
                return true;
            return  false;
        }
        return  (index<arr.length-1) && (node.data == arr[index]) && (checkIfPathExists(node.left, arr, ++index) || checkIfPathExists(node.right, arr, index));
    }
}
