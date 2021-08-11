package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

public class CheckSubtree {

    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);

        Btree root2 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 4);
        Btree.insertNewNodeLevelOder(root2, 6);
        System.out.println(isSubTree(root1, root2));
    }

    public static boolean isSubTree(Btree node1 , Btree node2){
        if ( node2==null)
            return true;
        if(node1==null)
            return false;
        if(isIdentical(node1, node2))
            return true;
       return isSubTree(node1.left, node2) || isSubTree(node1.right, node2);
    }

    public static boolean isIdentical(Btree node1, Btree node2){
        if (node1==null && node2==null)
            return true;
        if(node1==null || node2==null)
            return false;
        return (node1.data == node2.data) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
}
