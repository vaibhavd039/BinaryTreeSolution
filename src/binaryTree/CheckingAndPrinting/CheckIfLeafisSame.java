package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfLeafisSame {
   static Queue<Btree> queue1 = new LinkedList<>();
    static  Queue<Btree> queue2 = new LinkedList<>();

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


        Btree root2 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 4);
        Btree.insertNewNodeLevelOder(root2, 5);
        Btree.insertNewNodeLevelOder(root2, 6);
        Btree.insertNewNodeLevelOder(root2, 7);
        Btree.insertNewNodeLevelOder(root2, 8);
        Btree.insertNewNodeLevelOder(root2, 9);
        Btree.insertNewNodeLevelOder(root2, 10);
        Btree.insertNewNodeLevelOder(root2, 11);
        Btree.insertNewNodeLevelOder(root2, 12);
        Btree.insertNewNodeLevelOder(root2, 13);
        Btree.insertNewNodeLevelOder(root2, 14);
        Btree.insertNewNodeLevelOder(root2, 15);

        System.out.println(doesContainSameLeaves(root1, root2));

    }

    public static boolean doesContainSameLeaves(Btree node1, Btree node2) {
        generateQueueofLeaf1(node1);
        generateQueueofLeaf2(node2);
        if(queue1.equals(queue2))
            return true;
        return false;
    }

    public static void generateQueueofLeaf1(Btree node){
        if (node == null)
            return;
        if(node.left ==null && node.right == null)
            queue1.add(node);
        generateQueueofLeaf1(node.left);
        generateQueueofLeaf1(node.right);
    }

    public static void generateQueueofLeaf2(Btree node){
        if (node == null)
            return;
        if(node.left ==null && node.right == null)
            queue2.add(node);
        generateQueueofLeaf2(node.left);
        generateQueueofLeaf2(node.right);
    }

}
