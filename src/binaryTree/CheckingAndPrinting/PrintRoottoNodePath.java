package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

import java.util.ArrayList;
import java.util.List;

public class PrintRoottoNodePath {
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
        Btree temp = root1.right.right.right;
        printRootToNodePath(root1,temp, new ArrayList<>());
    }

    public static boolean printRootToNodePath(Btree node, Btree temp, List<Btree> path){
        if(temp ==null || node ==null)
            return false;
        path.add(node);
        if(temp.data == node.data){
            path.stream().forEach(i->System.out.print(i.data+"\t"));
            return true;
        }

        if (!printRootToNodePath(node.left, temp, path) && !printRootToNodePath(node.right, temp, path)){
            path.remove(node);
            return false;
        }
        else {
            return true;
        }
    }
}
