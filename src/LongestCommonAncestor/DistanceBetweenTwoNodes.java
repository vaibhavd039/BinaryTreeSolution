package LongestCommonAncestor;

import introduction.Btree;

public class DistanceBetweenTwoNodes {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);
        Btree.insertNewNodeLevelOder(root1, 7);
        Btree.insertNewNodeLevelOder(root1, 8);
        Btree.insertNewNodeLevelOder(root1, 9);
        Btree.insertNewNodeLevelOder(root1, 10);
        Btree.insertNewNodeLevelOder(root1, 11);
        Btree.insertNewNodeLevelOder(root1, 12);
        Btree.insertNewNodeLevelOder(root1, 13);
        Btree.insertNewNodeLevelOder(root1, 14);
        Btree.insertNewNodeLevelOder(root1, 15);
        Btree.insertNewNodeLevelOder(root1, 16);
        Btree.insertNewNodeLevelOder(root1, 17);
        Btree node = findLCA(root1, 8, 11);
        int left = findDistance(node, 8,11, 0);
        int right = findDistance(node, 8,11, 0);
       System.out.println(left+right);
    }
    public static Btree findLCA(Btree root, int node1, int node2){
        if(root==null)
            return null;
        if(root.data ==node1 || root.data==node2){
            return root;
        }
        Btree left = findLCA(root.left, node1, node2);
        Btree right = findLCA(root.right, node1, node2);
        if(left!=null && right !=null)
            return root;
        return left != null ? left: right;
    }
     public static  int findDistance(Btree node, int node1, int node2, int distance){
        if(node == null)
            return  -1;
        if(node.data == node1 || node.data == node2)
            return distance;
        int left =  findDistance(node.left, node1,  node2, distance+1);
        int right =  findDistance(node.left, node1,  node2, distance+1);
      return  left!= -1? left: right;
     }
}
