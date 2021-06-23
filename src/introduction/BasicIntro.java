package introduction;

public class BasicIntro {
    public static void main(String [] args){
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.levelOrderTraversal(root);
    }
}
