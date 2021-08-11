package binarySearchTree.construct;

//Given a Singly Linked List which has data members sorted in ascending order.
// create BST

import binarySearchTree.basics.BSTree;

public class SortedLinkedLIsttoBST {
    static LinkedListImpl linkedlist;
    static LLNode head;
    public static void main(String[] args) {
        linkedlist = new LinkedListImpl();
        linkedlist.insertData(12);
        linkedlist.insertData(11);
        linkedlist.insertData(10);
        linkedlist.insertData(9);
        linkedlist.insertData(8);
        linkedlist.insertData(7);
        linkedlist.insertData(6);
        linkedlist.insertData(5);
        linkedlist.insertData(4);
        linkedlist.insertData(3);
        linkedlist.insertData(2);
        linkedlist.insertData(1);
        head = linkedlist.head;
        int  n = 12;
       BSTree root=  createTreefromLL(12);
        BSTree.inOrderTraversal(root);
    }

    public static BSTree createTreefromLL(int n) {
        if(head==null)
            return null;
        if(n<=0)
            return null;
        BSTree left = createTreefromLL(n/2);
        BSTree root = new BSTree(head.data);
        root.left = left;
        head = head.next;
        root.right = createTreefromLL(n-n/2-1);
        return root;
    }
}

class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListImpl {
    LLNode head;

    public void insertData(int data) {
        LLNode temp = new LLNode(data);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
}
