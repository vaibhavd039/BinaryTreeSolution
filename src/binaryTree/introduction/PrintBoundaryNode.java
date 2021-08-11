package binaryTree.introduction;

public class PrintBoundaryNode {

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
        printBoundaryNodes(root);
    }

    public static void printBoundaryNodes(Btree node) {
        if (node == null)
            return;

        System.out.println(node.data);
        printBoundaryLeftSubtree(node.left);
        printLeafNode(node.left);
        printBoundaryRightSubtree(node.right);
        printLeafNode(node.right);
    }

    public static void printBoundaryLeftSubtree(Btree node){
            if(node == null )
                return;
            if(node.left!=null){
                System.out.println(node.data);
                printBoundaryLeftSubtree(node.left);
            } else if(node.right!=null){
                System.out.println(node.data);
                printBoundaryLeftSubtree(node.right);
            }
    }


    public static void printBoundaryRightSubtree(Btree node){
        if(node == null )
            return;
        if(node.right!=null){
            printBoundaryRightSubtree(node.right);
            System.out.println(node.data);
        } else if(node.left!=null){
            printBoundaryRightSubtree(node.left);
            System.out.println(node.data);
        }
    }

    public static void printLeafNode(Btree node) {
        if (node == null)
            return;

        printLeafNode(node.left);
        if (node.left == null && node.right == null)
            System.out.println(node.data);
        printLeafNode(node.right);
    }

}
