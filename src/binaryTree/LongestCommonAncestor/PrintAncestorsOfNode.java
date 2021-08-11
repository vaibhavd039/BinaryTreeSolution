package binaryTree.LongestCommonAncestor;

import binaryTree.introduction.Btree;

import java.util.Stack;

public class PrintAncestorsOfNode {
    static Stack<Btree> mystack =  new Stack<>();
    public static void main(String[] args) {

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
        Btree node = new Btree(15);
        getTheAncestors(root1,node );
        while(!mystack.isEmpty()){
            System.out.println(mystack.pop().data);
        }

    }

    public static boolean getTheAncestors(Btree root, Btree node){
        if(root==null)
            return false;
        if(root.data == node.data || getTheAncestors(root.left, node) || getTheAncestors(root.right, node) ){
            mystack.push(root);
            return true;
        }
    return false;
    }
}
