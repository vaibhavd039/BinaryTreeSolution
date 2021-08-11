package binaryTree.introduction;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        reverseLevelOrder(root);
    }

    public static void reverseLevelOrder(Btree node) {
        if (node == null)
            return;
        Stack<Btree> st= new Stack<>();
        Queue<Btree> queue= new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Btree temp = queue.poll();
            st.push(temp);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop().data+"\t");
        }
    }
}
