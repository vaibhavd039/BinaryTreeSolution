package introduction;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineBYLine {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        Btree.levelOrderTraversal(root);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        lineByLineLevelOrderTraversal(root);
    }

    public static void lineByLineLevelOrderTraversal(Btree node){
        if(node == null)
            return;
        Btree linebreaker = new Btree(-1);
        Queue<Btree> queue = new LinkedList<>();
        queue.add(node);
        queue.add(linebreaker);
        while(!queue.isEmpty()){
            Btree temp = queue.poll();
            if(temp==null)
                continue;
            if(temp.equals(linebreaker) && !queue.isEmpty()){
                System.out.println("");
                queue.add(linebreaker);
                continue;
            }
            if(!temp.equals(linebreaker)) {
                System.out.print(temp.data + "\t");
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
    }
}
