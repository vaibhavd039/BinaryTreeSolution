package binaryTree.introduction;

import java.util.HashMap;
import java.util.Map;

public class PostOrderFromPreOrderAndInorder {
    static int preIndex = 0;
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        printPostOrder(pre, inorder);
    }

    public static void printPostOrder(int[] pre, int[] inorder) {
        Map<Integer, Integer> indexMapping = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMapping.put(inorder[i], i);
        }
        printValues(pre, inorder, indexMapping, 0, pre.length-1);
    }

    public static void printValues(int[] pre, int[] inorder, Map<Integer, Integer> indexMapping, int startindex, int endIndex) {
        if(startindex>endIndex)
            return;
        int root = indexMapping.get(pre[preIndex++]);
        printValues(pre, inorder, indexMapping, startindex, root-1);
        printValues(pre, inorder, indexMapping, root+1, endIndex);
        System.out.print(inorder[root] + " ");
    }

}
