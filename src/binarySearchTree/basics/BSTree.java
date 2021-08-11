package binarySearchTree.basics;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
    public int data;
    public BSTree left;
    public BSTree right;

    public BSTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static BSTree insert(BSTree root, int data) {
        BSTree bst = new BSTree(data);
        if (root == null) {
            return bst;
        }
        if (data > root.data) {
            root.right = insert(root.right, data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        return root;
    }
    
    public static void preOrderTraversal(BSTree root) {
        if (root == null)
            return;
        System.out.print(root.data + "\t");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(BSTree root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + "\t");
        inOrderTraversal(root.right);
    }

    public static BSTree delete(BSTree root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null) {
                root = root.right;
                root.right = null;
                return root;
            } else if (root.right == null) {
                root = root.left;
                root.left = null;
                return root;
            }
            //find inorder successor to delete it
            //just next largest number
            // that can be copied over here without any issue
            else {
                int inorderSuc = getInOrderSuccesor(root);
                root.data = inorderSuc;
                delete(root.right, inorderSuc);
            }
        } else if (root.data > data) {
            root.left = delete(root.left, data);
        } else {
            root.right = delete(root.right, data);
        }
        return root;
    }

    public static int getInOrderSuccesor(BSTree root) {
        int minvalue = root.data;
        while (root.left != null) {
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;
    }

    public static void levelOrderTraversal(BSTree root) {
        if (root == null)
            return;
        Queue<BSTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BSTree node = queue.poll();
            if (node == null)
                continue;
            System.out.print(node.data + "\t");
            queue.add(node.left);
            queue.add(node.right);
        }
        System.out.print("\n");
    }
}
