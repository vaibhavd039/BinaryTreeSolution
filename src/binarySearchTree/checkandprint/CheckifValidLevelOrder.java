package binarySearchTree.checkandprint;

import java.util.LinkedList;
import java.util.Queue;

public class CheckifValidLevelOrder {
    public static void main(String [] args){
        int [] arr = {5,2,8,1,3,6,9,4,7,10};
        System.out.println(isValidLevelOrder(arr));
    }
    
    public static boolean isValidLevelOrder(int [] arr){
        int i =0;
        int n = arr.length;
        MyNode node = new MyNode(arr[0], Integer.MIN_VALUE, Integer.MAX_VALUE);
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(node);
        MyNode mynode = new MyNode();
        while(i<n && !queue.isEmpty()){
            MyNode temp = queue.peek();
            if(i<n && arr[i]<=temp.data && arr[i]> temp.min){
                mynode.data = arr[i++];
                mynode.min= temp.min;
                mynode.max = temp.data;
                queue.add(mynode);
            }
    
    
            if(i<n && arr[i]>= temp.data && arr[i]< temp.max){
                mynode.data = arr[i++];
                mynode.min= temp.data;
                mynode.max = temp.max;
                queue.add(mynode);
            }
            
        }
        if(i==n)
            return true;
        else
            return false;
    }
    
    
}


class MyNode{
    int data;
    int min;
    int max;
    MyNode(){
    
    }
    MyNode(int data, int min , int max){
        this.data = data;
        this.min = min;
        this.max= max;
    }
    
}