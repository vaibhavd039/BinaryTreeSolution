package introduction;

import java.util.LinkedList;
import java.util.Queue;

public class Btree {
    public int data;
    public Btree left;
    public Btree right;

    public Btree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static void inOrderTraverse(Btree root) {
        if (root == null)
            return;
        inOrderTraverse(root.left);
        System.out.print(root.data);
        inOrderTraverse(root.right);
    }

    public static void preOrderTraverse(Btree root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void postOrderTraverse(Btree root) {
        if (root == null)
            return;
        postOrderTraverse(root.right);
        postOrderTraverse(root.left);
        System.out.println(root.data);
    }

    public static Btree levelOrderTraversal(Btree root) {
        Queue<Btree> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Btree node = queue.poll();
            System.out.println("node data is = " + node.data);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return root;
    }

    public static boolean isNodeAvailable(Btree root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        return isNodeAvailable(root.left, data) || isNodeAvailable(root.right, data);
    }


    public static Btree findaNode(Btree root, int data) {
        if (root == null)
            return null;
        if (root.data == data)
            return root;
        Queue<Btree> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Btree node = queue.poll();
            if(node.data == data)
                return node;
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return null;
    }

    public static Btree insertNewNodeLevelOder(Btree root, int data) {
        if(root == null){
            root = new Btree(data);
            return root;
        }
        Btree newnode = new Btree(data);
        Queue<Btree> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Btree node = queue.poll();
            if (node.left == null) {
                node.left = newnode;
                return root;
            }
            else
                queue.add(node.left);
            if (node.right == null) {
                node.right = newnode;
                return root;
            }
            else
                queue.add(node.right);
        }
        return root;
    }

    public static void deleteTheNode(Btree root, int data) {
        if (root == null)
            return;
        if (root.data == data){
            root =null;
            return;
        }
        Btree temp = null;
        Btree keynode = null;
        Queue<Btree> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
             temp = queue.poll();
            if (temp.data == data)
                keynode = temp;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        if(keynode != null)
        {
            int lastNumber = temp.data;
            deleteTheLastElement(root, temp);
            keynode.data = lastNumber;
        }
    }

    private static void deleteTheLastElement(Btree root, Btree temp) {
        if (root == temp) {
            root = null;
            return;
        }
        Queue<Btree> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Btree node = queue.poll();
            if(node == temp){
                node =null;
                return;
            }
            if(node.right ==temp) {
                node.right = null;
                return;
            }
            else queue.add(node.right);
            if(node.left ==temp){
                node.left = null;
                return;
            }
            else queue.add(node.left);
        }
    }

}
