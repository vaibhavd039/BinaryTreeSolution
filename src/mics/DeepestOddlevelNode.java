package mics;

import introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestOddlevelNode {

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
        deepestOddlevelNode(node);

    }

    public static Btree deepestOddlevelNode(Btree node){
        if(node == null)
            return null;
        Btree temp =null;
        int level = 0;
        int oddLevel = 0;
        Queue<Btree> myqueue  = new LinkedList<>();
        myqueue.add(node);
        while(!myqueue.isEmpty()){
            int count = myqueue.size();
            while(count>0){
                count--;
                Btree newNode = myqueue.poll();
                if(newNode==null)
                    continue;
                temp = newNode;
                myqueue.add(newNode.left);
                myqueue.add(newNode.right);
            }
            level ++;
            if(level%2!=0){
                oddLevel = level;
            }
        }
        System.out.print(oddLevel);
        return temp;
    }

}
