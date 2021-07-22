package LongestCommonAncestor;

//Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA). You may assume that both the values exist in the tree.

import introduction.Btree;

public class LCABtree {
    public static void main(String[] args) {
        System.out.println("Hello");
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
        Btree.insertNewNodeLevelOder(root1, 16);
        Btree.insertNewNodeLevelOder(root1, 17);
        Btree node = findLCA(root1, 8, 11);
        System.out.println(node.data);
    }

    public static Btree findLCA(Btree root, int node1, int node2) {
        if (root == null)
            return null;
        if (root.data == node1 || root.data == node2) {
            return root;
        }
        Btree leftLCA = findLCA(root.left, node1, node2);
        Btree rightLCA = findLCA(root.right, node1, node2);
        if(leftLCA!=null && rightLCA!=null)
            return root;
        return leftLCA !=null ? leftLCA:rightLCA;
    }

}
