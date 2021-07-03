package introduction;

import com.sun.beans.editors.ByteEditor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PerfectBinaryTreeBottomtoTop {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        Btree.insertNewNodeLevelOder(root, 8);
        Btree.insertNewNodeLevelOder(root, 9);
        Btree.insertNewNodeLevelOder(root, 10);
        Btree.insertNewNodeLevelOder(root, 11);
        Btree.insertNewNodeLevelOder(root, 12);
        Btree.insertNewNodeLevelOder(root, 13);
        Btree.insertNewNodeLevelOder(root, 14);
        Btree.insertNewNodeLevelOder(root, 15);
        printBinaryTreeBottomToTop(root);
    }

    public static void printBinaryTreeBottomToTop(Btree node){
        Queue<Btree> queue = new LinkedList<>();
        Stack<Btree> st= new Stack<>();
        st.push(node);
        queue.add(node.left);
        queue.add(node.right);
        while(!queue.isEmpty()){
            Btree first = queue.poll();
            Btree second= queue.poll();
            if(first == null || second == null || first.left ==null)
                continue;
            st.push(second.left);
            st.push(first.right);
            st.push(second.right);
            st.push(first.left);

            queue.add(first.left);
            queue.add(second.right);
            queue.add(first.right);
            queue.add(second.left);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop().data+"\t");
        }
    }

}
