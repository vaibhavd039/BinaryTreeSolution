package binaryTree.introduction;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccesorPredeseccorSum {
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
        Btree.inOrderTraverse(node);
        List<Integer> tree = new ArrayList<>();
        List<Integer> newtree = new ArrayList<>();
        tree.add(0);
        populateTree(node, tree);
        tree.add(0);

        System.out.println("\t");
        for(int i =1;i<tree.size()-1;i++){
            newtree.add(tree.get(i-1)+tree.get(i+1));
        }
        newtree.forEach(System.out::println);
    }
    public static void populateTree(Btree node, List<Integer> tree){
        if(node == null)
            return;
        populateTree(node.left, tree);
        tree.add(node.data);
        populateTree(node.right, tree);
    }
}
