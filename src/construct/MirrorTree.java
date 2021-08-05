package construct;
import introduction.Btree;
public class MirrorTree {
    public static void main(String[] args) {
        System.out.println("Hello");
            Btree root1 = introduction.Btree.insertNewNodeLevelOder(null, 1);
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
            Btree root2 = createMirror(root1);
            Btree.levelOrderTraversal(root2);
        }
        public static Btree createMirror(Btree node){
        if(node == null)
            return  null;
        Btree left = createMirror(node.left);
         Btree right = createMirror(node.right);
         node.left = right;
         node.right = left;
         return  node;
        }


}
