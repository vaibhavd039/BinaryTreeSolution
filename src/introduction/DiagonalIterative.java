package introduction;

import java.util.LinkedList;
import java.util.Queue;

public class DiagonalIterative {
    static Queue<Btree> queue;

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
        queue = new LinkedList<>();
        printIterativeDiagonal(root);
    }

    public static void printIterativeDiagonal(Btree node) {
        if (node == null)
            return;
        queue.add(node);
        while (!queue.isEmpty()) {
           Btree temp = queue.poll();
           if(temp == null)
               continue;
           System.out.print(temp.data+"\t");
           queue.add(temp.left);
           while(temp.right!=null){
                temp = temp.right;
                System.out.print(temp.data+"\t");
                queue.add(temp.left);
           }
           System.out.println(" ");
        }
    }
}
