package binaryTree.mics;

import binaryTree.introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestRightChild {
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
        getTheDeepestRightNode(node);
    }

    public static  void getTheDeepestRightNode(Btree node){

    if(node == null)
        return;
    Btree temp = null;
    Queue<Btree> myqueue = new LinkedList<>();
        myqueue.add(node);
        while(!myqueue.isEmpty()){
            Btree newNew = myqueue.poll();
            if(newNew == null)
                continue;
            temp = newNew;
            myqueue.add(newNew.right);
        }
        System.out.print(temp.data);
    }

}
