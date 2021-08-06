package mics;

import introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecursivetoDeleteTree {
    public static  void main(String [] args){
        Btree node = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(node, 2);
        Btree.insertNewNodeLevelOder(node, 3);
        Btree.insertNewNodeLevelOder(node, 4);
        Btree.insertNewNodeLevelOder(node, 5);
        Btree.insertNewNodeLevelOder(node, 6);
        Btree.insertNewNodeLevelOder(node, 7);
        Btree.insertNewNodeLevelOder(node, 8);
        Btree.insertNewNodeLevelOder(node, 9);
        deleteTree(node);
        Btree.levelOrderTraversal(node);
    }

    public static void deleteTree(Btree node){
        if(node == null)
            return;
        Stack<Btree> st = new Stack<>();
        Queue<Btree> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
           Btree temp =  queue.poll();
           if(temp ==null)
               continue;
           st.push(temp);
           queue.add(temp.left);
           queue.add(temp.right);
        }
        while(!st.isEmpty()) {
            Btree temp = st.pop();
            temp.left = null;
            temp.right = null;
        }
        node = null;
    }

}
