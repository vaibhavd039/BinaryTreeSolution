package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class DeadNodeTree {
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
        BSTree.levelOrderTraversal(node);
        System.out.println(doesDeadNodeExist(node, 1, Integer.MAX_VALUE));
    }
    
    public static boolean doesDeadNodeExist(BSTree node, int min, int max) {
        if (node == null)
            return false;
        if (min == max)
            return true;
        return doesDeadNodeExist(node.left, min, node.data - 1) || doesDeadNodeExist(node.right, node.data + 1, max);
    }
    
}
