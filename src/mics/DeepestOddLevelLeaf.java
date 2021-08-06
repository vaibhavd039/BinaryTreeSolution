package mics;

import introduction.Btree;

public class DeepestOddLevelLeaf {
    public static void main(String[] ahrs) {
        Btree node = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(node, 2);
        Btree.insertNewNodeLevelOder(node, 3);
        Btree.insertNewNodeLevelOder(node, 4);
        Btree.insertNewNodeLevelOder(node, 5);
        Btree.insertNewNodeLevelOder(node, 6);
        Btree.insertNewNodeLevelOder(node, 7);
        Btree.insertNewNodeLevelOder(node, 8);
        Btree.insertNewNodeLevelOder(node, 9);
        System.out.print(deepestOddLevelLeaf(node,1));
    }

    public static int deepestOddLevelLeaf(Btree root, int level) {
        if(root == null)
            return 0;
        if(root.left == null && root.right==null && level%2 !=0)
            return level;
        return Math.max(deepestOddLevelLeaf(root.left, level+1), deepestOddLevelLeaf(root.right, level+1));
    }
}
