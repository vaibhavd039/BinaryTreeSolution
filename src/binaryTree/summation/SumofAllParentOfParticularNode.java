package binaryTree.summation;

import binaryTree.introduction.Btree;

//Given a binary tree containing n nodes. The problem is to find the sum of all the parent node’s which have a child node with value x.
public class SumofAllParentOfParticularNode {
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
        System.out.print(sumOfParentOfXUtil(root, 7));
    }
    public static int getSumOfParent(Btree Node){
        return  -1;
    }

    static  int sum = 0;
    static void sumOfParentOfX(Btree root, int x)
    {

        if (root == null)
            return;
        if ((root.left != null && root.left.data == x) ||
                (root.right != null && root.right.data == x))
            sum += root.data;

        sumOfParentOfX(root.left, x);
        sumOfParentOfX(root.right, x);

    }

    // utility function to find the
// sum of all the parent nodes
// having child node x
    static int sumOfParentOfXUtil(Btree root,
                                  int x)
    {
        sum = 0;
        sumOfParentOfX(root, x);

        // required sum of parent nodes
        return sum;
    }
}
