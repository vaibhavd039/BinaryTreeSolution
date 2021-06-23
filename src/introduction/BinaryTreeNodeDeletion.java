package introduction;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNodeDeletion {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        Btree.levelOrderTraversal(root);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Btree.deleteTheNode(root, 2);
        Btree.levelOrderTraversal(root);
    }


}
