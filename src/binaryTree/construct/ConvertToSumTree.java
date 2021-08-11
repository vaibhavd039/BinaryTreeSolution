package binaryTree.construct;

import binaryTree.introduction.Btree;

//Given a Binary Tree where each node has positive and negative values. Convert this to a tree
//        where each node contains the sum of the left and right sub trees in the original tree.
//        The values of leaf nodes are changed to 0.
public class ConvertToSumTree {
    public static void main(String[] args) {
        System.out.println("Hello");
       Btree root1 = binaryTree.introduction.Btree.insertNewNodeLevelOder(null, 1);
       Btree.insertNewNodeLevelOder(root1, 2);
       Btree.insertNewNodeLevelOder(root1, 3);
       Btree.insertNewNodeLevelOder(root1, 4);
       Btree.insertNewNodeLevelOder(root1, 5);
       Btree.insertNewNodeLevelOder(root1, 6);
       Btree.insertNewNodeLevelOder(root1, 7);
       Btree.insertNewNodeLevelOder(root1, 8);
       Btree.insertNewNodeLevelOder(root1, 9);
       Btree.insertNewNodeLevelOder(root1, 10);
       Btree.insertNewNodeLevelOder(root1, 11);
       Btree.insertNewNodeLevelOder(root1, 12);
       Btree.insertNewNodeLevelOder(root1, 13);
       Btree.insertNewNodeLevelOder(root1, 14);
       Btree.insertNewNodeLevelOder(root1, 15);
       Btree.insertNewNodeLevelOder(root1, 16);
       Btree.insertNewNodeLevelOder(root1, 17);
        root1.data = createSumTree(root1);
        Btree.levelOrderTraversal(root1);
    }

    public static int createSumTree(Btree root){
     if(root == null)
         return 0;
       int old_data = root.data ;
        root.data =  createSumTree(root.left) + createSumTree(root.right);
        return root.data + old_data;
    }
}
