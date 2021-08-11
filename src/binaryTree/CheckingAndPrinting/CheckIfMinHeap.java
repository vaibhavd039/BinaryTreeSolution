package binaryTree.CheckingAndPrinting;
/*
Given the level order traversal of a Complete Binary Tree, determine whether the Binary Tree is a valid Min-Heap*/

public class CheckIfMinHeap {
    public static void main(String[] args) {
        int [] levelorder =  {10,2,3,4,5,6,15,8,9,10,12,13,14};
        System.out.println(isMinHeap(levelorder));
    }

    public static boolean isMinHeap(int [] arr){
        int n = arr.length -1;
        for(int i =n/2-1 ; i>=0;i--){
            if(arr[i]> arr[2*i+1])
                return false;
            if(2*i+2<n){
                if(arr[i]>arr[2*i+2])
                    return false;
            }
        }
        return true;
    }
}
