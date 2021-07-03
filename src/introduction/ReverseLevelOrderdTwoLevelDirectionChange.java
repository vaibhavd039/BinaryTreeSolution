package introduction;

import sun.awt.X11.XSystemTrayPeer;

import java.util.*;

public class ReverseLevelOrderdTwoLevelDirectionChange {
    static boolean left_direction;
    public static void main(String [] args){
        Btree node = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(node, 2);
        Btree.insertNewNodeLevelOder(node, 3);
        Btree.insertNewNodeLevelOder(node, 4);
        Btree.insertNewNodeLevelOder(node, 5);
        Btree.insertNewNodeLevelOder(node, 6);
        Btree.insertNewNodeLevelOder(node, 7);
        Btree.insertNewNodeLevelOder(node, 8);
        Btree.insertNewNodeLevelOder(node, 9);
        Btree.insertNewNodeLevelOder(node, 10);
        Btree.insertNewNodeLevelOder(node, 11);
        Btree.insertNewNodeLevelOder(node, 12);
        Btree.insertNewNodeLevelOder(node, 13);
        Btree.insertNewNodeLevelOder(node, 14);
        Btree.insertNewNodeLevelOder(node, 15);
        Btree.insertNewNodeLevelOder(node, 16);
        Btree.insertNewNodeLevelOder(node, 17);
        Btree.insertNewNodeLevelOder(node, 18);
        Btree.insertNewNodeLevelOder(node, 19);
        Btree.insertNewNodeLevelOder(node, 20);
        Btree.insertNewNodeLevelOder(node, 21);
        Btree.insertNewNodeLevelOder(node, 22);
        Btree.insertNewNodeLevelOder(node, 23);
        Btree.insertNewNodeLevelOder(node, 24);
        Btree.insertNewNodeLevelOder(node, 25);
        Btree.insertNewNodeLevelOder(node, 26);
        LevelOrderLineBYLine.lineByLineLevelOrderTraversal(node);
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        directionchangeAfterTwoLevel(node);
    }
    public static void directionchangeAfterTwoLevel(Btree node){
        if(node == null)
            return;
        left_direction= true;
        Stack<Btree> st = new Stack<>();
        Queue<Btree> queue = new LinkedList<>();
        st.push(node);
        while(!(st.isEmpty() && queue.isEmpty())){
            while(!st.isEmpty()){
                Btree temp = st.pop();
                if(temp == null)
                    continue;
                System.out.print(temp.data+"\t");
                if(left_direction){
                    queue.add(temp.left);
                    queue.add(temp.right);
                } else {
                    queue.add(temp.right);
                    queue.add(temp.left);
                }
            }

            System.out.println("");
            while(!queue.isEmpty()){
                Btree temp = queue.poll();
                if(temp == null)
                    continue;
                System.out.print(temp.data+"\t");
                if(left_direction){
                    st.push(temp.left);
                    st.push(temp.right);
                } else {
                    st.push(temp.right);
                    st.push(temp.left);
                }
            }
            System.out.println("");
            changeDirection();
        }
    }

    public static void changeDirection(){
        left_direction = !left_direction;
    }
}
