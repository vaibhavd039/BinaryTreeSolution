package summation;
/*/Consider lines of slope -1 passing between nodes (dotted lines in below diagram).
The diagonal sum in a binary tree is the sum of all node’s data lying between these lines.
Given a Binary Tree, print all diagonal sums.*/

import introduction.Btree;

import java.util.HashMap;
import java.util.Map;

public class DiaGonalSumOfBinaryTree {
    static Map<Integer, Double> mapOFDiagonalSum = new HashMap<>();
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
        getDiagonalSum(root, 0);
        mapOFDiagonalSum.entrySet().stream().forEach(i->System.out.println(i.getValue()));

    }
    public static void getDiagonalSum(Btree node, int key){
        if(node==null)
            return;
        Double sum = mapOFDiagonalSum.get(key);
        if(sum ==null){
            sum = 0D +node.data;
        } else {
            sum =sum + node.data;
        }
        mapOFDiagonalSum.put(key,sum);
        if(node.right!=null){
            getDiagonalSum(node.right, key);
        }
        if(node.left!=null){
            getDiagonalSum(node.left, key+1);
        }
    }

}
