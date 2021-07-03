package introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PostOrderFromInandPre {
    public static void main(String [] args){
        int [] pre ={1,2,4,5,3,6,7};
        int [] inorder ={4,2,5,1,6,3,7};
        printPostOrder(pre, inorder, 6);
    }
    public static void printPostOrder(int [] pre, int [] inorder, int n ){
        int x = findIndex(inorder, pre[0]);
        if(x!=0) {
            printPostOrder(Arrays.copyOfRange(pre,1, n), inorder, x);
        }

        if(x!=n-1) {
            printPostOrder(Arrays.copyOfRange(pre, x + 1, n), Arrays.copyOfRange(inorder, x + 1, n), n - x - 1);

        }

        System.out.print(pre[0]+"\t");
    }
    public static int findIndex(int [] inorder, int x){
        for(int i =0;i<inorder.length;i++) {
            if (inorder[i] == x)
                return i;
        }
        return  -1;
    }

}
