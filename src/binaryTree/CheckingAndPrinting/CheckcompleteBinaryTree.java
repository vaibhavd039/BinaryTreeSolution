package binaryTree.CheckingAndPrinting;
/*Given a Binary Tree, write a function to check whether the given Binary Tree is Complete Binary Tree or not.
        A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled,
         and all nodes are as far left as possible. S
        ee the following examples.*/

import binaryTree.introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckcompleteBinaryTree {

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
        Btree.insertNewNodeLevelOder(root, 10);
        Btree.insertNewNodeLevelOder(root, 11);
        Btree.insertNewNodeLevelOder(root, 12);
        Btree.insertNewNodeLevelOder(root, 13);
        Btree.insertNewNodeLevelOder(root, 14);
        Btree.insertNewNodeLevelOder(root, 15);
        Btree.insertNewNodeLevelOder(root, 16);
        System.out.println(checkCompleteBinaryTree(root));
    }

    public static boolean checkCompleteBinaryTree(Btree node) {
        boolean nonCompleteNodeFound = false;
        if (node == null)
            return false;
        Queue<Btree> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Btree temp = queue.poll();
            if (temp == null)
                continue;
            if (nonCompleteNodeFound) {
                if ((temp.left == null && temp.right != null) || (temp.left != null && temp.right == null))
                    return false;
            }
            if ((temp.left != null && temp.right == null)) {
                nonCompleteNodeFound = true;
            } else if (temp.left != null && temp.right == null) {
                return false;
            }
            queue.add(temp.left);
            queue.add(temp.right);
        }
        return true;
    }
}
