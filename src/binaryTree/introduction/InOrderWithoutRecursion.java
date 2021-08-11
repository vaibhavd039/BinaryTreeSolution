package binaryTree.introduction;

import java.util.Stack;

public class InOrderWithoutRecursion {
    public static void main(String[] args) {
        System.out.println("Hello");
        Btree root = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root, 2);
        Btree.insertNewNodeLevelOder(root, 3);
        Btree.insertNewNodeLevelOder(root, 4);
        Btree.insertNewNodeLevelOder(root, 5);
        Btree.insertNewNodeLevelOder(root, 6);
        Btree.insertNewNodeLevelOder(root, 7);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Btree.inOrderTraverse(root);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        inOrderWithoutStack(root);
    }

    public static void inOrderWithoutStack(Btree root){
        if(root == null)
            return;
        Stack<Btree> st = new Stack<Btree>();
        Btree node = root;
        while(st.size()>0 || node !=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            System.out.print(node.data + "\t");
            node = node.right;
        }
    }
}
