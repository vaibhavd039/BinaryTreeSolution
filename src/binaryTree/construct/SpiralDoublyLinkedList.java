package binaryTree.construct;
//Convert a Binary Tree into Doubly Linked List in spiral

//Given a Binary Tree, convert it into Doubly Linked List where the nodes are represented Spirally.
// The left pointer of the binary tree node should act as a previous node for created DLL and right pointer should act as next node.

//The solution should not allocate extra memory for DLL nodes.

//Iterate the tree in spiral way
// insert nodes in tree
// keep track of prev node

import binaryTree.introduction.Btree;

import java.util.Stack;

public class SpiralDoublyLinkedList {
    static DLLNode head;
    static DLLNode prev;
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
       head =  createSpiralDLLFromTree(root1);
        DLLNode temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static DLLNode createSpiralDLLFromTree(Btree root){
        if(root == null)
            return null;
        Stack<Btree> stack1 = new Stack<>();
        Stack<Btree> stack2 = new Stack<>();
        stack1.push(root);

        while(!stack1.isEmpty() || !stack2.isEmpty()){
         while(!stack1.isEmpty()){
            Btree node = stack1.pop();
            if(node ==null)
                continue;
            if(head==null) {
                head = new DLLNode(node.data);
                prev = head;
            } else {
                DLLNode newNode = new DLLNode(node.data);
                prev.next = newNode;
                newNode.prev = prev;
                prev = newNode;
            }
            stack2.push(node.right);
            stack2.push(node.left);
         }

            while(!stack2.isEmpty()){
                Btree node = stack2.pop();
                if(node ==null)
                    continue;
                if(head==null) {
                    head = new DLLNode(node.data);
                    prev = head;
                } else {
                    DLLNode newNode = new DLLNode(node.data);
                    prev.next = newNode;
                    newNode.prev = prev;
                    prev = newNode;
                }
                stack1.push(node.left);
                stack1.push(node.right);
            }
        }
        return head;
    }


}

