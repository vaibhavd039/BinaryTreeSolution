package binaryTree.CheckingAndPrinting;
/*A full binary tree is defined as a binary tree in
        which all nodes have either zero or two child nodes.
        Conversely, there is no node in a full binary tree, which has one child node.*/


import binaryTree.introduction.Btree;

public class CheckFullBinaryTree {

    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
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
        System.out.println(isFullBinaryTree(root1));
    }

    public static boolean isFullBinaryTree(Btree node){
        if(node == null)
            return  true;
       return  ((node.left !=null && node.right!=null) || (node.left==null && node.right==null))
                && isFullBinaryTree(node.left) && isFullBinaryTree(node.right);
    }
}
