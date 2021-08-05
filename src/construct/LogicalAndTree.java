package construct;

import introduction.Btree;

//Given a Binary Tree (Every node has at most 2 children) where each node has value either 0 or 1.
// Convert a given Binary tree to a tree that holds Logical AND property, i.e.,
// each node value should be the logical AND between its children.

public class LogicalAndTree {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root1 = introduction.Btree.insertNewNodeLevelOder(null, 0);
        Btree.insertNewNodeLevelOder(root1, 1);
        Btree.insertNewNodeLevelOder(root1, 0);
        Btree.insertNewNodeLevelOder(root1, 0);
        Btree.insertNewNodeLevelOder(root1, 1);
        Btree.insertNewNodeLevelOder(root1, 1);
        Btree.insertNewNodeLevelOder(root1, 1);
        root1.data= convertLogicalAnd(root1);
        Btree.levelOrderTraversal(root1);

    }

    public static int convertLogicalAnd(Btree root){
        if(root ==null)
            return 0;
        if(root.left==null && root.right==null)
            return root.data;
        int left = convertLogicalAnd(root.left);
        int right = convertLogicalAnd(root.right);
        root.data = (left ==1) && (right==1)?1:0;
        return root.data;
    }

}
