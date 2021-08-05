package construct;

//Given the array representation of Complete Binary Tree i.e, if index i is the parent, index 2*i + 1
// is the left child and index 2*i + 2
// is the right child.
// The task is to find the minimum number of swap required to convert it into Binary Search Tree.

import javafx.util.Pair;

import java.util.*;

public class NumberOfSwapsForBST {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11};
        Integer[] res2Arr = new Integer[arr.length];
        List<Integer> mylist = new ArrayList<>();

        getInorderArray(arr, mylist, arr.length - 1, 0);
        mylist.toArray(res2Arr);
        System.out.println(getMiniMumSwaps(res2Arr));
    }

    public static List<Integer> getInorderArray(int[] arr, List<Integer> inorderList, int n, int index) {
        if (arr == null || arr.length == 0)
            return inorderList;
        if (index > n)
            return inorderList;
        getInorderArray(arr, inorderList, n, 2 * index + 1);
        inorderList.add(arr[index]);
        getInorderArray(arr, inorderList, n, 2 * index + 2);
        return inorderList;
    }

    public static int getMiniMumSwaps(Integer[] arr) {
        int ans = 0;
        List<Pair<Integer, Integer>> mypair = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            mypair.add(new Pair<>(arr[i], i));
        }
        mypair.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        Boolean[] vis = new Boolean[arr.length];
        Arrays.fill(vis, false);

        for (int i = 0; i < arr.length; i++) {
            if (vis[i] || arr[i] == mypair.get(i).getKey())
                continue;
            int cycleSize = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;
                j = mypair.get(j).getValue();
                cycleSize++;
            }
            if (cycleSize > 0)
                ans += cycleSize-1;
        }

        return ans;
    }
}
