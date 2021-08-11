package binaryTree.construct;

import binaryTree.introduction.Btree;
///Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. T
// he left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL.
// The order of nodes in DLL must be the same as in Inorder for the given Binary Tree

public class DoublyLinkedListfromTree {
    static DLLNode prev;
    static DLLNode head;

    public static void main(String[] args) {
        System.out.println("Hello");
        binaryTree.introduction.Btree root1 = binaryTree.introduction.Btree.insertNewNodeLevelOder(null, 1);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 2);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 3);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 4);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 5);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 6);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 7);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 8);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 9);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 10);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 11);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 12);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 13);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 14);
        binaryTree.introduction.Btree.insertNewNodeLevelOder(root1, 15);
        createDLLFromTree(root1);
        while(head.next!=null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    public static void createDLLFromTree(Btree node){
        if(node == null)
            return;
        DLLNode newdllNode = new DLLNode(node.data);
        createDLLFromTree (node.left);
        if(prev ==null)
            head= newdllNode;
        else {
            newdllNode.prev = prev;
            prev.next = newdllNode;
        }
        prev = newdllNode;
        createDLLFromTree (node.right);
        return;
    }


}
class DLLNode{
    int data;
    DLLNode next;
    DLLNode prev;
    DLLNode(int data){
        this.data = data;
        this.next = this.prev =null;
    }
}

