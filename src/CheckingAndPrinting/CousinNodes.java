package CheckingAndPrinting;

import introduction.Btree;
/*Given the binary Tree and the two nodes say ‘a’ and ‘b’, determine whether the two nodes are cousins of each other or not.
Two nodes are cousins of each other if they are at same level and have different parents.*/

public class CousinNodes {
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
        Btree node1 = root.left.left;
        Btree node2 = root.right.left;
      System.out.println(checkIfCousinNodes(root, node1, node2));
    }

    public static boolean isSiblings(Btree node, Btree a, Btree b) {
        if (node == null)
            return false;
        return ((node.left == a && node.right == b) || (node.left == b && node.right == a)) && isSiblings(node.right, a, b) && isSiblings(node.left, a, b);
    }

    public static boolean checkIfCousinNodes(Btree node, Btree a, Btree b) {
        if(node == null)
            return false;
        int lv1 = findLevel(node, a,0);
        int lv2 = findLevel(node, b,0);
        return  (lv1 == lv2 && !isSiblings(node, a , b));
    }
    public static int findLevel(Btree root, Btree node, int level){
        if(root==null){
            return  0;
        }
        if(root ==node)
            return level;
        int l =  findLevel(root.left, node, level+1);
        if(l!=0)
            return l;
         return    findLevel(root.right, node, level+1);
    }
}
