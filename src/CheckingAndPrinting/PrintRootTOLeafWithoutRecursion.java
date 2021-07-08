package CheckingAndPrinting;

import introduction.Btree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Given a binary tree, print all its root to leaf paths without using recursion. For example, consider the following Binary Tree.
public class PrintRootTOLeafWithoutRecursion {
    static Map<Btree, Btree> parentMap = new HashMap<>();

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
        fetchPathFromRootToLeaf(root1);
    }

    public static void fetchPathFromRootToLeaf(Btree node) {
        if (node == null)
            return;
        Stack<Btree> st = new Stack<>();
        st.push(node);
        parentMap.put(node, null);
        while (!st.isEmpty()) {
            Btree temp = st.pop();
            if (temp == null)
                continue;
            if (temp.right == null && temp.left == null) {
                printParentTOLeafUsingMap(temp);
            }
            if (temp.right != null) {
                st.push(temp.right);
                parentMap.put(temp.right, temp);
            }
            if (temp.left != null) {
                st.push(temp.left);
                parentMap.put(temp.left, temp);
            }
        }
    }

    public static void printParentTOLeafUsingMap(Btree node) {
        if (node == null)
            return;
        Stack<Btree> st = new Stack<>();
        st.push(node);
        Btree temp;
        do{
            temp = parentMap.get(node);
            if(temp ==null)
                continue;
            st.push(temp);
            node = temp;
        } while(temp !=null);
        while (!st.isEmpty()){
            System.out.print(st.pop().data+"\t");
        }
        System.out.println("");
    }

}
