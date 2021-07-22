package LongestCommonAncestor;

import introduction.Btree;

public class PrintCommonNodesOnPAtrh {
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
        Btree node = findLCA(root1, 4, 11);
        printPathFromRoottoLCA(root1, node);
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

    public static boolean printPathFromRoottoLCA(Btree root, Btree lca){
        if(root==null)
            return false;
        if(root.data == lca.data || printPathFromRoottoLCA(root.left, lca) || printPathFromRoottoLCA(root.right, lca)){
            System.out.println(root.data);
            return true;
        }
        return false;
    }

}
