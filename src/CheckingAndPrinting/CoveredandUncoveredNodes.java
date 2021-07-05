package CheckingAndPrinting;

import introduction.Btree;
/*
Given a binary tree, you need to check whether sum of all covered elements is equal to sum of all uncovered elements or not.
In a binary tree, a node is called Uncovered if it appears either on left boundary or right boundary. Rest of the nodes are called covered.

*/

public class CoveredandUncoveredNodes {
    public static int total = 0;
    public static int boundary = 0;
    public static int leafSum = 0;

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
       System.out.println(coveredVsUncovered(root));
    }

    public static boolean coveredVsUncovered(Btree node) {
        getTotalSum(node);
        getLeafSum(node);
        int leftSum= getLeftBoundarySum(node.left);
        int rightSum=  getRightBoundarySum(node.right);
        boundary = node.data +leftSum + rightSum + leafSum;
        return boundary *2 == total;
    }

    public static void getTotalSum(Btree node) {
        if (node == null)
            return;
        total+= node.data;
        getTotalSum(node.left);
        getTotalSum(node.right);
    }

    public static int getLeftBoundarySum(Btree node){
        if(node.left== null && node.right == null)
            return 0;
        if(node.left!=null){
          return node.data + getLeftBoundarySum(node.left);
        }
       else {
           return  node.data + getLeftBoundarySum(node.right);
        }
    }

    public static int getRightBoundarySum(Btree node){
        if(node.left== null && node.right == null)
            return 0;
        if(node.right!=null){
            return node.data + getLeftBoundarySum(node.right);
        }
        else {
            return  node.data + getLeftBoundarySum(node.left);
        }
    }
    public static void getLeafSum(Btree node){
        if(node == null)
            return;
        if(node.left == null && node.right==null)
            leafSum +=node.data;
        getLeafSum(node.left);
        getLeafSum(node.right);
    }
}
