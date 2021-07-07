package CheckingAndPrinting;

import introduction.Btree;

import java.util.Stack;

public class IterativeMirrorCheck {
    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        Btree.insertNewNodeLevelOder(root1, 6);
        Btree.insertNewNodeLevelOder(root1, 7);
        Btree root2 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root2, 3);
        Btree.insertNewNodeLevelOder(root2, 2);
        Btree.insertNewNodeLevelOder(root2, 7);
        Btree.insertNewNodeLevelOder(root2, 6);
        Btree.insertNewNodeLevelOder(root2, 5);
        Btree.insertNewNodeLevelOder(root2, 4);
       System.out.println(IsMirror(root1, root2));
    }

    public static boolean IsMirror(Btree node1, Btree node2){
        if(node1 == null && node2==null)
            return true;
        if (node1 == null || node2==null)
            return false;
        Stack<Btree> s1 = new Stack<>();
        Stack<Btree> s2 = new Stack<>();
        s1.push(node1);
        s2.push(node2);
        while(!s1.isEmpty() && !s2.isEmpty()){
            Btree temp1 = s1.pop();
            Btree temp2 = s2.pop();
            if(temp1 == null && temp2==null)
                return true;
            if (temp1 == null || temp2==null)
                return false;
            if(temp1.data !=temp2.data)
                return  false;
            else{
                s1.push(temp1.right);
                s1.push(temp1.left);
                s2.push(temp1.right);
                s2.push(temp1.left);
            }
        }
        if(s2.isEmpty() && s2.isEmpty())
            return true;
        return  false;
    }

}
