package binaryTree.summation;
//Given a Binary Tree, find the vertical sum of the nodes that are in the same vertical line. Print all sums through different vertical lines.

import binaryTree.introduction.Btree;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {
    static Map<Integer, Integer> map = new HashMap<>();

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
        ComputeVerticalDistance(root, 0);
        map.entrySet().stream().forEach(i->System.out.println(i.getKey() +" "+i.getValue()));
    }

    public static void ComputeVerticalDistance(Btree node, int distance) {
        if (node == null)
            return;
        Integer num = map.get(distance);
        num = num != null ? num + node.data : node.data;
        map.put(distance, num);
        ComputeVerticalDistance(node.left, distance-1);
        ComputeVerticalDistance(node.right, distance+1);
    }


}
