package binaryTree.introduction;

public class NthNodeInorderTraversal {
    public static int counter= 0;
    public static  void main(String [] args){
        Btree btree  = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(btree, 2);
        Btree.insertNewNodeLevelOder(btree, 3);
        Btree.insertNewNodeLevelOder(btree, 4);
        Btree.insertNewNodeLevelOder(btree, 5);
        printNthNode(btree, 2);
    }

    public static void printNthNode(Btree node, int n){
        if (node == null)
            return;
        if(counter<=n){
            printNthNode(node.left, n);
            counter++;
            if(counter==n)
                System.out.println(node.data);
            printNthNode(node.right,n);
        }
    }
}
