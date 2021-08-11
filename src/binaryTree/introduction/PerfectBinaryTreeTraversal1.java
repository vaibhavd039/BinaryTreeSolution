package binaryTree.introduction;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectBinaryTreeTraversal1 {
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
        Btree.levelOrderTraversal(root);
        printPerfectBinaryTree(root);
    }

    public static void printPerfectBinaryTree(Btree root){
        if (root == null){
            return;
        }
        Queue<Btree> queue= new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        System.out.println(root.data);
        while(!queue.isEmpty()) {
            Btree first = queue.poll();
            Btree second = queue.poll();
            if(first == null || second == null)
                continue;
            System.out.print(first.data + " "+ second.data+" ");
            queue.add(first.left);
            queue.add(second.right);
            queue.add(first.right);
            queue.add(second.left);
        }
    }
}
