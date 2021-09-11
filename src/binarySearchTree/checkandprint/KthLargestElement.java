package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class KthLargestElement {
    public static int counter= 0;
    public static  int k = 5;
    public static void main(String[] args) {
        BSTree node = BSTCreator.getBST();
        BSTree.inOrderTraversal(node);
        System.out.println(getKthElement(node).data);
    }
    
    public static  BSTree getKthElement(BSTree node){
        if(node ==null)
            return null;
        BSTree right = getKthElement(node.right);
        if(right!=null)
            return right;
        counter++;
        if(counter==k)
            return node;
        return getKthElement(node.left);
    }
}
