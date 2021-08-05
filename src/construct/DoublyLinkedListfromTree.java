package construct;

import introduction.Btree;
///Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. T
// he left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL.
// The order of nodes in DLL must be the same as in Inorder for the given Binary Tree

public class DoublyLinkedListfromTree {
    static DLLNode prev;
    static DLLNode head;

    public static void main(String[] args) {
        System.out.println("Hello");
        introduction.Btree root1 = introduction.Btree.insertNewNodeLevelOder(null, 1);
        introduction.Btree.insertNewNodeLevelOder(root1, 2);
        introduction.Btree.insertNewNodeLevelOder(root1, 3);
        introduction.Btree.insertNewNodeLevelOder(root1, 4);
        introduction.Btree.insertNewNodeLevelOder(root1, 5);
        introduction.Btree.insertNewNodeLevelOder(root1, 6);
        introduction.Btree.insertNewNodeLevelOder(root1, 7);
        introduction.Btree.insertNewNodeLevelOder(root1, 8);
        introduction.Btree.insertNewNodeLevelOder(root1, 9);
        introduction.Btree.insertNewNodeLevelOder(root1, 10);
        introduction.Btree.insertNewNodeLevelOder(root1, 11);
        introduction.Btree.insertNewNodeLevelOder(root1, 12);
        introduction.Btree.insertNewNodeLevelOder(root1, 13);
        introduction.Btree.insertNewNodeLevelOder(root1, 14);
        introduction.Btree.insertNewNodeLevelOder(root1, 15);
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

