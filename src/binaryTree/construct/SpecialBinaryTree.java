package binaryTree.construct;

//Given Inorder Traversal of a Special Binary Tree in
// Which key of every node is greater than keys in left and right children,
// binaryTree.binarySearchTree.construct the Binary Tree and return root.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class SpecialBinaryTree {
    static List<Integer> sorted;
    static int counter = 0;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 10, 40, 30, 28));
        sorted = createHashMapInSortedWay(arrayList);
        Btree root = createTree(arrayList, 0, arrayList.size() - 1);
        Btree.inOrderTraverse(root);
    }

    //sort the array , the capture the index such that highest element index is stored at first
    public static List<Integer> createHashMapInSortedWay(List<Integer> arrayList) {
        Map<Integer, Integer> mymap = IntStream.range(0, arrayList.size()).boxed().collect(Collectors.toMap(arrayList::get, i -> i));
        LinkedHashMap<Integer, Integer> sorted = mymap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        return sorted.values().stream().collect(Collectors.toList());
    }

    // create the tree
    public static Btree createTree(List<Integer> arrayList, int start, int end) {
        if (arrayList.size() == 0 || arrayList == null || start > end) {
            return null;
        }
        int rootIndex = sorted.get(counter++);
        Btree root = new Btree(arrayList.get(rootIndex));
        root.left = createTree(arrayList, start, rootIndex - 1);
        root.right = createTree(arrayList, rootIndex + 1, end);
        return root;
    }

}

 class Btree{
    int data;
     Btree left;
     Btree right;
     Btree(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }

    public static void inOrderTraverse( Btree root) {
        if (root == null)
            return;
        inOrderTraverse(root.left);
        System.out.print(root.data+"\t");
        inOrderTraverse(root.right);
    }
}
