package introduction;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DiagonalTraversal {
    static Map<Integer, List<Btree>> slopMap;

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
        slopMap = new HashMap<>();
        printDiagonal(root);
    }

    public static void printDiagonal(Btree node) {
        createSlopMap(node, 0);
        slopMap.entrySet().parallelStream().forEach(e -> e.getValue().stream().forEach(n -> System.out.print(n.data + "\t")));

    }

    public static void createSlopMap(Btree node, int key) {
        if (node == null)
            return;
        List<Btree> slopList = slopMap.get(key);
        if (slopList == null || slopList.isEmpty()) {
            slopList = new LinkedList<>();
        }
        slopList.add(node);
        slopMap.put(key, slopList);
        createSlopMap(node.left, key + 1);
        createSlopMap(node.right, key);
    }
}
