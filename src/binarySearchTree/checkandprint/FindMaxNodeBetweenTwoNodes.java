package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class FindMaxNodeBetweenTwoNodes {
    public static void main(String[] args) {
       BSTree root = BSTCreator.getBST();
        findMaxBetweenTwoNodes(root, 1, 7);
    }
    
    public static void findMaxBetweenTwoNodes(BSTree root, int key1, int key2){
      BSTree lca = findLCA(root, key1, key2);
      System.out.println(Math.max(findMaxNodeInPath(lca, key1), findMaxNodeInPath(lca, key2)));
    }
    
    public static int findMaxNodeInPath(BSTree node , int key){
        int temp = Integer.MIN_VALUE;
            if(node==null)
                return -1;
            while(node.data!=key && node!=null){
                temp = Math.max(node.data , temp);
                if(node.data>key){
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
            return  temp;
    }
    
    public static BSTree findLCA(BSTree root, int key1, int key2) {
        if (root == null)
            return null;
        if ((root.data <= key1 && root.data >= key2) || (root.data <= key2 && root.data >= key1)) {
            return root;
        }
        if(root.data < key1 && root.data < key2){
            return findLCA(root.right, key1, key2);
        } else {
            return findLCA(root.left, key1, key2);
        }
    }
}
