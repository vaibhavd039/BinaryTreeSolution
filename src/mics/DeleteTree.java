package mics;
//To delete a tree, we must traverse all the nodes of the tree and delete them one by one.

import introduction.Btree;

public class DeleteTree {
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
    }
    public static Btree deleteTree(Btree node){
        if(node==null)
            return null;
       node.left  = deleteTree(node.left);
       node.right  = deleteTree(node.right);
       return null;
    }

}
