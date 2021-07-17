package summation;

import introduction.Btree;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree containing n nodes.
The problem is to find the sum of all nodes on the longest path from root to leaf node.
If two or more paths compete for the longest path, then the path having maximum sum of nodes is being considered.
*/

public class SumOfLongestPath {
    static int maxSum =0;
    static int maxLevel = 0;
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
        Btree.insertNewNodeLevelOder(root, 1);
        findSumOfLongestPath(root);
        System.out.println("Sum is = "+maxSum+", and level is = "+maxLevel);
    }
    public static void findSumOfLongestPath(Btree root){
        if(root == null)
            return;
        Queue<Element> queue = new LinkedList<>();
        Element el = new Element(root, 0, root.data);
        queue.add(el);
        while (!queue.isEmpty()){
            Element element = queue.poll();
            if(element==null || element.node ==null)
                continue;
            Btree node = element.node;
            if(element.level> maxLevel){
                maxLevel = element.level;
                maxSum = element.sum;
            }
            if(element.level == maxLevel && element.sum > maxSum){
                maxSum = element.sum;
                maxLevel = element.level;
            }
            if(node.left!=null){
                Element leftElement = new Element(node.left, element.level+1,node.left.data+ element.sum);
                queue.add(leftElement);
            }
            if(node.right!=null) {
                Element rightElement = new Element(node.right, element.level + 1, node.right.data + element.sum);
            queue.add(rightElement);
            }
        }
    }
}

class Element{
    Btree node;
    int level;
    int sum;

    public Element(Btree node, int level, int sum) {
        this.node = node;
        this.level = level;
        this.sum = sum;
    }
}