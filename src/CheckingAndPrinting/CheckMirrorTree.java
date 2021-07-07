package CheckingAndPrinting;

import introduction.Btree;

public class CheckMirrorTree {

    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);
        Btree.insertNewNodeLevelOder(root1, 7);
        Btree root2 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 7);
        Btree.insertNewNodeLevelOder(root2, 6);
        Btree.insertNewNodeLevelOder(root2, 5);
        Btree.insertNewNodeLevelOder(root2, 4);

        System.out.println(isMirrorImage(root1, root2));
    }

    public static boolean isMirrorImage(Btree node1, Btree node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;
        return (node1.data == node2.data) && isMirrorImage(node1.left, node2.right) && isMirrorImage(node1.right, node2.left);
    }
}
