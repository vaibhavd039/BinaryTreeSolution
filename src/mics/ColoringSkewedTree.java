package mics;

/*Given a skewed tree (Every node has at most one child)
        with N nodes and K colors. You have to assign a color from 1 to K to
        each node such that parent and child has different colors. Find the maximum number of ways of coloring the nodes.*/

public class ColoringSkewedTree {
    public static void main(String[] args)
    {
        int N = 3, K = 3;
        System.out.println(countWays(N, K));
    }

    public static Long countWays(int n , int k){
        return k * fastPow(k-1, n-1);
    }
    public static Long fastPow(int base , int pow){
            if(pow ==0)
                return 1L;
            Long temp = fastPow( base, pow/2);
            if(pow%2 ==0)
                return  temp * temp;
            else
                return base * temp * temp;
    }


}
