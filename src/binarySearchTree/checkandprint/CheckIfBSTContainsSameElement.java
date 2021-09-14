package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;
import binarySearchTree.construct.BSTtoGreaterSumTree;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CheckIfBSTContainsSameElement {
    public static void main(String[] agrs) {
        BSTree node1 = BSTCreator.getBST();
        BSTree node2 = BSTCreator.getBST();
        System.out.println(isSameBST(node1, node2));
    }
    public static boolean isSameBST(BSTree node1 , BSTree node2){
        Vector<Integer> list1 = new Vector<>();
        Vector<Integer> list2 = new Vector<>();
        inorderListOfTree(node1, list1);
        inorderListOfTree(node2, list2);
       return  list1.equals(list2);
    }
    
    public static void inorderListOfTree(BSTree node, Vector<Integer> mylist) {
        if (node == null) {
            return;
        }
        inorderListOfTree(node.left, mylist);
        mylist.add(node.data);
        inorderListOfTree(node.right, mylist);
    }
    
}
