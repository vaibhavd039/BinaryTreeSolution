package introduction;

public class NthNodePostOrderTraversal {
    public static int counter=0;
    public static void main(String [] args){
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        printNthnode(root, 4);
    }

    public static void printNthnode(Btree root, int n){
        if(counter>n || root ==null)
            return;
        printNthnode(root.left, n);
        printNthnode(root.right, n);
        counter++;
        if(counter==n)
            System.out.println(root.data);
    }
}
