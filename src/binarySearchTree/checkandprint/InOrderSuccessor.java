package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class InOrderSuccessor {
    public static  void main(String [] args){
        BSTree node = BSTCreator.getBST();
        PrintInOrderSucc(node,node.left.right.right);
    }
    
    public static void PrintInOrderSucc(BSTree root, BSTree node){
        if(node==null)
            return;
        if(node.right!=null){
            int x = findMin(node.right);
        }
        BSTree succ= null;
        while(node !=null){
            if(node.data < root.data){
                succ = root;
                root = root.left;
            } else if (node.data > root.data){
                root = root.right;
            } else {
                break;
            }
        }
        System.out.println(succ.data);
    }
    
    public static int findMin(BSTree node){
        if(node == null)
            return -1;
        while(node.left!=null){
            node= node.left;
        }
        return node.data;
    }
}
