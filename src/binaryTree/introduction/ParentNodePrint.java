package binaryTree.introduction;

public class ParentNodePrint {
    public static void  main(String [] args){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        inorderTraversal(node);
        populateSuccessor(node, null);
        System.out.println("\t");
        inorderTraversal(node);
        printSuccessor(node.right.right);
    }

    public static void inorderTraversal(Node node){
        if (node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+"\t");
        inorderTraversal(node.right);
    }

    public static void populateSuccessor(Node node, Node previous){
            if(node ==null)
                return;
            populateSuccessor(node.left, node);
            node.next = previous;
            populateSuccessor(node.right, node);
    }

    public static void printSuccessor(Node node){
        System.out.println("\t");
        while(node !=null){
            System.out.print(node.data+"\t");
            node = node .next;
        }
    }
}


class Node{
    int data;
    Node left;
    Node right;
    Node next;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.next  =  null;
    }
}

