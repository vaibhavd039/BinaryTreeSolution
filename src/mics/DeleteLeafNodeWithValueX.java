package mics;
//Given a binary tree and a target integer x,
// delete all the leaf nodes having value as x.
// Also, delete the newly formed leaves with the target value as x..

import introduction.Btree;

public class DeleteLeafNodeWithValueX {
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
        node = deleteNodeWithValueX(node, 8);
        Btree.levelOrderTraversal(node);
    }

    public static Btree deleteNodeWithValueX(Btree node , int data){
        if(node == null)
            return  null;
        node.left = deleteNodeWithValueX(node.left,data);
        node.right = deleteNodeWithValueX(node.right , data);
        if(node.data == data && node.left == null && node.right == null)
            return null;
        return node;
    }


}
