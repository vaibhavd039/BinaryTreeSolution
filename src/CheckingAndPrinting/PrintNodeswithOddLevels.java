package CheckingAndPrinting;

import introduction.Btree;
import sun.awt.X11.XSystemTrayPeer;

//Given a binary tree, print nodes of odd level in any order. Root is considered at level 1.
public class PrintNodeswithOddLevels {
    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);
        Btree.insertNewNodeLevelOder(root1, 7);
        Btree.insertNewNodeLevelOder(root1, 8);
        Btree.insertNewNodeLevelOder(root1, 9);
        Btree.insertNewNodeLevelOder(root1, 10);
        Btree.insertNewNodeLevelOder(root1, 11);
        Btree.insertNewNodeLevelOder(root1, 12);
        Btree.insertNewNodeLevelOder(root1, 13);
        Btree.insertNewNodeLevelOder(root1, 14);
        Btree.insertNewNodeLevelOder(root1, 15);
        Btree.insertNewNodeLevelOder(root1, 17);
        Btree.insertNewNodeLevelOder(root1, 18);
        Btree.insertNewNodeLevelOder(root1, 19);
        printOddLevelNodes(root1, 1);
    }
    public static void printOddLevelNodes(Btree node, int level){
        if(node == null)
            return;
        if(level %2 != 0)
            System.out.println(node.data);
        printOddLevelNodes(node.left, level);
        level++;
        printOddLevelNodes(node.right,level);
    }
}
