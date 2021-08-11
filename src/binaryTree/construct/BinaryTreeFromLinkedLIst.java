package binaryTree.construct;
/*
Given Linked List Representation of Complete Binary Tree, binaryTree.binarySearchTree.construct the Binary tree.
 A complete binary tree can be represented in an array in the following approach.
        If root node is stored at index i, its left, and right children are stored at indices 2*i+1, 2*i+2 respectively.
        Suppose tree is represented by a linked list in same way,
        how do we convert this into normal linked representation of binary tree where every node has data, left and right pointers? In the linked list representation, we cannot directly access the children of the current node unless we traverse the list.*/

import binaryTree.introduction.Btree;

import java.util.*;

public class BinaryTreeFromLinkedLIst {

    public static void main(String [] args){
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.pushElement(15);
        linkedList.pushElement(14);
        linkedList.pushElement(13);
        linkedList.pushElement(12);
        linkedList.pushElement(11);
        linkedList.pushElement(10);
        linkedList.pushElement(9);
        linkedList.pushElement(8);
        linkedList.pushElement(7);
        linkedList.pushElement(6);
        linkedList.pushElement(5);
        linkedList.pushElement(4);
        linkedList.pushElement(3);
        linkedList.pushElement(2);
        linkedList.pushElement(1);
        Btree root = createBtreeFromLL(linkedList);
        Btree.levelOrderTraversal(root);
    }

    public static Btree createBtreeFromLL(LinkedListImpl linkedList){
        if(linkedList.head == null)
            return null;
        Btree node = new Btree(linkedList.head.data);
        Queue<Btree> queue = new LinkedList<>();
        linkedList.head = linkedList.head.next;
        queue.add(node);
        while(linkedList.head!=null){
            Btree parentNode = queue.poll();
            if(parentNode == null)
                continue;
            parentNode.left = new Btree(linkedList.head.data);
            linkedList.head = linkedList.head.next;
            if(linkedList.head!=null) {
                parentNode.right = new Btree(linkedList.head.data);
                linkedList.head = linkedList.head.next;
            }
            queue.add(parentNode.left);
            queue.add(parentNode.right);
        }
        return node;
    }

}


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListImpl{
    ListNode head;
    LinkedListImpl(){
        this.head = null;
    }
    public void pushElement(int data){
        ListNode lnode = new ListNode(data);
        lnode.next = head;
        head=lnode;
    }
}
