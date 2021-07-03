package introduction;

import java.util.Stack;

public class IterativePreorder {
    public static void main(String[] args) {
        System.out.println("Hello");
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
        printPreOrderIterative(root);

    }
    public static void printPreOrderIterative(Btree root){
        if(root == null)
            return;
        Stack <Btree> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
           Btree node =  st.pop();
           if(node == null)
               continue;
           System.out.print(node.data + "\t");
           st.push(node.right);
           st.push(node.left);

        }
    }

}
