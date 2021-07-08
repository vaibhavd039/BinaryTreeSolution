package CheckingAndPrinting;
//Given the roots of a tree. print out all of its root-to-leaf paths one per line..

import introduction.Btree;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathRoottoLead {
    public static void main(String[] args) {
        Btree root1 = Btree.insertNewNodeLevelOder(null, 1);
        Btree.insertNewNodeLevelOder(root1, 2);
        Btree.insertNewNodeLevelOder(root1, 3);
        Btree.insertNewNodeLevelOder(root1, 4);
        Btree.insertNewNodeLevelOder(root1, 5);
        printRootToLeafPath(root1, new ArrayList<>());
    }

    public static  void printRootToLeafPath(Btree node, List<Btree> path){
        if(node ==null)
            return;
        path.add(node);
        if(node.left == null && node.right==null){
            path.stream().forEach(i->System.out.print(i.data+"\t"));
            System.out.println(" ");
            return;
        }
        printRootToLeafPath(node.left, new ArrayList<Btree>(path));
        printRootToLeafPath(node.right, new ArrayList<Btree>(path));
    }
}
