package binaryTree.introduction;

public class InOrderSuccesor {
    public static Node next;
    public static void  main(String [] args){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        inorderTraversal(node);
        populateSuccessor(node);
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

    public static void populateSuccessor(Node node){
        if(node ==null)
            return;
        populateSuccessor(node.right);
        node.next = next;
        next= node;
        populateSuccessor(node.left);
    }

    public static void printSuccessor(Node node){
        System.out.println("\t");
        while(node !=null){
            System.out.print(node.data+"\t");
            node = node .next;
        }
    }

}
