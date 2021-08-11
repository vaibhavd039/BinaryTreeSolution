package binaryTree.CheckingAndPrinting;
/*Given a Binary Tree, write a function to check whether the given Binary Tree is a prefect Binary Tree or not.
        A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.*/

import binaryTree.introduction.Btree;

public class CheckPerfectBinaryTree {
    static int leafLevel = -1;
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

        System.out.println(isPerfectBinaryTree(root, 0));
    }

    public static boolean isPerfectBinaryTree(Btree node, int level){
        if(node == null)
            return false;
        if(node.left == null && node.right==null){
            if(leafLevel == -1) {
                leafLevel = level;
                 return  true;
            }
            else if(leafLevel != level)
                return false;
            else
                return  true;
        }
       return isPerfectBinaryTree(node.left , level+1) && isPerfectBinaryTree(node.right , level+1);
    }

}
