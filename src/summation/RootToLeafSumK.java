package summation;

import introduction.Btree;
/*Given a binary tree and a number, return true if the tree has a root-to-leaf path
        such that adding up all the values along the path equals the given number. Return false if no such path can be found.*/

public class RootToLeafSumK {

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
        System.out.println(checkPathWithKSum(root, 45));
    }

    public static boolean checkPathWithKSum(Btree node, int remaining) {
        if (node == null)
            return false;
        if (node.right == null && node.left == null && remaining - node.data == 0) {
            return true;
        }
        return checkPathWithKSum(node.left, remaining - node.data) ||
                checkPathWithKSum(node.right, remaining - node.data);
    }
}
