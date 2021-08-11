package binaryTree.introduction;

import java.util.Stack;

public class SpiralLevelOrder {
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
        spiralLevelOrderTraversal(root);
    }
    public static void spiralLevelOrderTraversal(Btree node){
        if(node == null)
            return;
        Stack<Btree> st1 = new Stack<>();
        Stack<Btree> st2 = new Stack<>();
        st1.push(node);
        while(!st1.isEmpty() || !st2.isEmpty()){
            while(!st1.isEmpty()){
                Btree temp = st1.pop();
                System.out.println(temp.data +  "\t");
                if(temp.right!=null)
                    st2.push(temp.right);
                if(temp.left!=null)
                  st2.push(temp.left);
            }
            while(!st2.isEmpty()){
                Btree temp = st2.pop();
                System.out.println(temp.data +  "\t");
                if(temp.left!=null)
                  st1.push(temp.left);
                if(temp.right!=null)
                 st1.push(temp.right);

            }
        }
    }

}
