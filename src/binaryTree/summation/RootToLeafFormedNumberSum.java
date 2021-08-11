package binaryTree.summation;

import binaryTree.introduction.Btree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafFormedNumberSum {
    public static List<Integer> mylist = new ArrayList<>();
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
        Btree.insertNewNodeLevelOder(root, 1);
        Btree.insertNewNodeLevelOder(root, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        formedNumber(root, 0);
       System.out.println(mylist.stream().reduce(0,(subtotal, value) ->subtotal+value));
    }

    public static void formedNumber(Btree node, int numberformed){
        if(node ==null)
            return;
        if(node.left==null && node.right==null){
            numberformed = numberformed+ node.data;
            mylist.add(numberformed);
        } else {
            numberformed = numberformed + node.data;
        }
        formedNumber(node.left, numberformed*10);
        formedNumber(node.right, numberformed*10);
    }

}
