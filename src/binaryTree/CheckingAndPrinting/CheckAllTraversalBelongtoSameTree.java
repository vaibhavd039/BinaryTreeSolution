package binaryTree.CheckingAndPrinting;

import binaryTree.introduction.Btree;

public class CheckAllTraversalBelongtoSameTree {

    static int preIndex= 0;
    public static void main(String[] args) {
        int inOrder[] = {4, 2, 5, 1, 3};
        int preOrder[] = {1, 2, 4, 5, 3};
        int postOrder[] = {4, 5, 2, 3, 1};

        Btree root = constructTree(preOrder, inOrder, 0,4);

        System.out.println(" ' ");
    }

    public static Btree constructTree(int [] pre, int [] inorder, int start, int end){
        if(start > end)
            return null;
        Btree node= new Btree(pre[preIndex]);
        int rootIndex = getIndexOfRoot(inorder, start, end, pre[preIndex]);
        preIndex++;
        node.left = constructTree(pre, inorder, start, rootIndex-1 );
        node.right = constructTree(pre, inorder, rootIndex+1, end);
        return node;
    }

    public static int getIndexOfRoot(int [] inorder , int start, int end, int data){
        for(int i = start; i<=end;i++){
            if(data == inorder[i])
                return i;
        }
        return -1;
    }


    }
