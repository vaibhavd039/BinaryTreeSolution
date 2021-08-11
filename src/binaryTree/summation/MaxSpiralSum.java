package binaryTree.summation;
/*Given a binary tree containing n nodes. The problem is to find the maximum sum obtained when the tree is spirally traversed.
        In spiral traversal one by one all levels are being traversed with the root level traversed from right to left,
        then next level from left to right, then further next level from right to left and so on.*/

import binaryTree.introduction.Btree;

import java.util.*;

public class MaxSpiralSum {
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
        Btree.insertNewNodeLevelOder(root, 16);
        System.out.println(getMaxSumKadane(getSpiralTraversal(root)));
    }

    public static List<Integer> getSpiralTraversal(Btree node){
        if (node == null)
            return Collections.emptyList();
        Stack<Btree> st1 = new Stack<>();
        Stack<Btree> st2 = new Stack<>();
        ArrayList<Integer> spiralArray = new ArrayList<>();
        st1.add(node);
        while(!st1.isEmpty() || !st2.isEmpty()) {

            while(!st1.isEmpty()){
                Btree temp = st1.pop();
                if(temp == null)
                    continue;
                spiralArray.add(temp.data);
                st2.push(temp.right);
                st2.push(temp.left);
            }
            while(!st2.isEmpty()){
                Btree temp = st2.pop();
                if(temp == null)
                    continue;
                spiralArray.add(temp.data);
                st1.push(temp.left);
                st1.push(temp.right);
            }
        }
        return spiralArray;
    }

    public static int getMaxSumKadane(List<Integer> arr){
        int maxTillHere = Integer.MIN_VALUE;
        int maxSoFar = Integer.MIN_VALUE;
        for(int i =0;i<arr.size();i++){
            if(maxTillHere< 0){
                maxTillHere = arr.indexOf(i);
            }else {
                maxTillHere += arr.indexOf(i);
            }
            maxSoFar = Math.max(maxSoFar, maxTillHere);
        }
        return maxSoFar;
    }
}
