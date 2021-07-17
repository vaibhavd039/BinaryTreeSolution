package summation;

import introduction.Btree;

//Sum of heights of all individual nodes in a binary tree
//Given a binary tree, find the sum of heights of all individual nodes in the tree.
public class SumofallHeight {
 static int sumOfHeight =0;
    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        System.out.println( getSumOfHeight(root));
    }

    public static int getSumOfHeight(Btree node){
            if(node ==null)
                return 0;
           int lh = getSumOfHeight(node.left);
        int rh = getSumOfHeight(node.right);
        return Math.max(lh,rh)+1;
    }

}
