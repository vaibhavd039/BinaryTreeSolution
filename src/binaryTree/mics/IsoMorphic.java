package binaryTree.mics;
//Write a function to detect if two trees are isomorphic.
//        Two trees are called isomorphic if one of them can be obtained from other by a series of flips,
//        i.e. by swapping left and right children of a number of nodes.

import binaryTree.introduction.Btree;

public class IsoMorphic {
        public static void main(String[] args) {
            Btree root = Btree.insertNewNodeLevelOder(null, 1);
            Btree.insertNewNodeLevelOder(root, 2);
            Btree.insertNewNodeLevelOder(root, 2);
            Btree.insertNewNodeLevelOder(root, 4);
            Btree.insertNewNodeLevelOder(root, 5);
            Btree.insertNewNodeLevelOder(root, 4);
            Btree.insertNewNodeLevelOder(root, 5);

           System.out.println( isIsoMorphic(root.left, root.right));
        }

        public static boolean isIsoMorphic (Btree node1 , Btree node2){
            if(node1 == null && node2 == null)
                return true;
            if (node1==null || node2==null)
                return  false;
            if(node1.data !=node2.data)
                return false;
            return  (isIsoMorphic(node1.left, node2.left) && isIsoMorphic(node1.right, node2.right))
                    ||
                    (isIsoMorphic(node1.left, node2.right) && isIsoMorphic(node1.right, node2.left));
        }

}
