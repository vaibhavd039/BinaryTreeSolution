package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class PredecessorAndSuccesro {
    static BSTree pre ;
    static BSTree succ ;
    public static void main(String [] args){
        BSTree node = BSTCreator.getBST();
        getPreDecessorAndSuccesor(node, 4);
        System.out.println(pre.data +" "+succ.data);
    }
    
    public static void getPreDecessorAndSuccesor(BSTree node , int key){
        if(node==null)
            return;
        if(node.data == key){
            if(node.left!=null){
                BSTree temp = node;
                    while(temp.right!=null){
                        temp = temp.right;
                    }
                    pre = temp;
            }
            if(node.right!=null){
                BSTree temp = node;
                while(temp.left!=null){
                    temp = temp.left;
                }
                succ = temp;
            }
        }
        
       else if(node.data < key){
            pre = node;
            getPreDecessorAndSuccesor(node.right, key);
        } else {
            succ = node;
            getPreDecessorAndSuccesor(node.left, key);
        }
    }
    
    
}
