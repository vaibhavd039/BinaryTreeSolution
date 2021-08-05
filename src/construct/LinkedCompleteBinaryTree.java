package construct;
//Linked complete binary tree & its creation

//A complete binary tree is a binary tree where each level ‘l’ except the last has 2^l nodes
// and the nodes at the last level are all left-aligned. Complete binary trees are mainly used in heap-based data structures.


import java.util.LinkedList;
import java.util.Queue;
import introduction.Btree;

public class LinkedCompleteBinaryTree {
    public static Queue<Btree> queue = new LinkedList<>();

    public static void main(String[] args) {
        Btree root = linkedInsertion(null, 1);
        root = linkedInsertion(root, 2);
        root = linkedInsertion(root, 3);
        root = linkedInsertion(root, 4);
        root = linkedInsertion(root, 5);
        root = linkedInsertion(root, 6);
        root = linkedInsertion(root, 7);
        Btree.levelOrderTraversal(root);

    }

    public static Btree linkedInsertion(Btree root, int data) {
        Btree temp = new Btree(data);
        if (root == null) {
            root = temp;
        } else {
            Btree node = queue.peek();
            if (node == null)
                return root;
            if (node.left == null)
                node.left = temp;
            else if (node.right == null) {
                node.right = temp;
            }
            else
                queue.poll();
        }
        queue.add(temp);
        return root;
    }
}

