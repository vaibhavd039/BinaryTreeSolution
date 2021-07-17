package summation;

import introduction.Btree;

/*Given a binary tree containing n nodes.
        The problem is to get the sum of all the leaf nodes which are at minimum level in the binary tree.*/
public class SumOFLeafAtMinLevel {
    public static int minLevel = Integer.MAX_VALUE;
    public static int minLevelLeafSum = 0;
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
        Btree.insertNewNodeLevelOder(root, 16);
        SumAtMinLevelLeaf(root, 0);
        System.out.println(minLevelLeafSum);
    }
    public static  void SumAtMinLevelLeaf(Btree node, int level){
        if(node ==null)
            return;
        if(node.left == null && node.right ==null){
            if(level ==minLevel){
                minLevelLeafSum +=node.data;
            }
            if(level < minLevel){
                minLevel = level;
                minLevelLeafSum = node.data;
            }
        } else{
            SumAtMinLevelLeaf(node.left, level+1);
            SumAtMinLevelLeaf(node.right , level+1);
        }

    }

}
