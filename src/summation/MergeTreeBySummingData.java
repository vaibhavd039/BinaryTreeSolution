package summation;

import introduction.Btree;

import javax.swing.plaf.basic.BasicTextAreaUI;

public class MergeTreeBySummingData {
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
        Btree.insertNewNodeLevelOder(root1, 1);
        Btree.insertNewNodeLevelOder(root1, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);

        Btree root2 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 4);
        Btree.insertNewNodeLevelOder(root2, 5);
        Btree.insertNewNodeLevelOder(root2, 6);
        Btree.insertNewNodeLevelOder(root2, 7);
        Btree.insertNewNodeLevelOder(root2, 8);
        Btree.insertNewNodeLevelOder(root2, 9);
        Btree.insertNewNodeLevelOder(root2, 1);
        Btree.insertNewNodeLevelOder(root2, 1);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 4);
        Btree.insertNewNodeLevelOder(root2, 5);
        Btree.insertNewNodeLevelOder(root2, 6);

        root1 = mergeTrees(root1, root2);
        Btree.levelOrderTraversal(root1);
    }
    public static Btree mergeTrees(Btree node1, Btree node2){
        if(node1==null)
            return node2;
        if(node2==null)
            return node1;
        node1.data +=node2.data;
        node1.left = mergeTrees(node1.left, node2.left);
        node1.right = mergeTrees(node1.right, node2.right);
        return node1;
    }

}
