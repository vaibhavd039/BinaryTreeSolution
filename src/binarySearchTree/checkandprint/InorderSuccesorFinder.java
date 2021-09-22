package binarySearchTree.checkandprint;

import binarySearchTree.basics.BSTree;

public class InorderSuccesorFinder {
    public static  void main(String [] args){
    BSTree node = BSTCreator.getBST();
    BSTree temp = node.left.left;
        getInOrderSuccesor(node, temp);
    }
    public static void getInOrderSuccesor(BSTree root, BSTree node){
                if(node.right!=null){
                    System.out.println(getMIN(node.right));
                    return;
                }
                BSTree succ=null;
                while(root!=null){
                    if(node.data < root.data){
                        succ=root;
                        root= root.left;
                    } else if(node.data>root.data){
                        root= root.right;
                    }
                    else break;
                }
                System.out.println(succ.data);
    }
    
    public static int getMIN(BSTree node){
        if(node==null)
            return  -1;
        while(node.left!=null){
            node = node.left;
        }
        return node.data;
    }
    
    public static void main(){
    
    }
}
