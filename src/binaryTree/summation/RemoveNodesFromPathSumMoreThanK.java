package binaryTree.summation;
//Remove all nodes which don’t lie in any path with sum>= k

//Given a binary tree, a complete path is defined as a path from root to a leaf.
// The sum of all nodes on that path is defined as the sum of that path.
// Given a number K, you have to remove (prune the tree) all nodes which don’t lie in any path with sum>=k.
//Note: A node can be part of multiple paths. So we have to delete it only in case when all paths from it have sum less than K.

import binaryTree.introduction.Btree;

public class RemoveNodesFromPathSumMoreThanK {
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
        root= pruneTheTree(root, 20);
        Btree.levelOrderTraversal(root);
    }

    public static  Btree pruneTheTree(Btree node, int sum){
        if(node == null)
            return  null;
        node.left = pruneTheTree(node.left, sum-node.data);
        node.right = pruneTheTree(node.right, sum-node.data);
        if(node.left == null && node.right ==null){
            if(sum > node.data)
                node=null;
        }
        return node;
    }
}
