package introduction;

import java.util.Stack;

public class IterativePostORder {

    public static void main(String[] args) {
        System.out.println("Hello");
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
        postOrderIterative(root);
    }
    public static void postOrderIterative(Btree node){
        if(node == null)
            return;
        Stack <Btree> first = new Stack<>();
        Stack <Btree> second = new Stack<>();
        first.push(node);
        while(!first.isEmpty()){
            Btree temp = first.pop();
            if(temp==null)
                continue;
            second.push(temp);
            first.push(temp.left);
            first.push(temp.right);

        }
        while(!second.isEmpty()){
            Btree temp = second.pop();
            if(temp==null)
                continue;
            System.out.print(temp.data +"\t");
        }
    }
}
