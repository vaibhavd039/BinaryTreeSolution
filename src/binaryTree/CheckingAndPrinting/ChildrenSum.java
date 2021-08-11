package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

//For every node, data value must be equal to sum of data values
// in left and right children. Consider data value as 0 for NULL children.

public class ChildrenSum {
    public static void main(String[] args) {
        Btree root = Btree.insertNewNodeLevelOder(null, 8);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.levelOrderTraversal(root);
        System.out.print(isChildrenSum(root));
    }

    public static boolean isChildrenSum(Btree node){
        if(node == null || (node.left == null && node.right==null)){
            return true;
        }
        int left_data = node.left !=null? node.left.data:0;
        int right_data= node.right !=null? node.right.data:0;
        return (node.data == left_data + right_data) && isChildrenSum(node.right) && isChildrenSum(node.left);
    }
}
