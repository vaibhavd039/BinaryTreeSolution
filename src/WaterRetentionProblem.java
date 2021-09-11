public class WaterRetentionProblem {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 4, 0, 2};
        int[] left_max = getLeftMax(arr);
        int[] right_max = getRightMax(arr);
        System.out.println(getMaxWaterHold(arr, left_max, right_max));
        
    }
    
    public static int [] getLeftMax(int [] arr){
        int max_so_far = Integer.MIN_VALUE;
         int[] left_max = new int[arr.length];
         for(int i=0;i <arr.length; i++){
             if(arr[i]>max_so_far){
                 max_so_far = arr[i];
                 left_max[i] = max_so_far;
             }
         }
         return left_max;
    }
    
    public static int [] getRightMax(int [] arr){
        int max_so_far = Integer.MIN_VALUE;
        int[] right_max = new int[arr.length];
        for(int i=arr.length-1;i>=0; i--){
            if(arr[i]>max_so_far){
                max_so_far = arr[i];
                right_max[i] = max_so_far;
            }
        }
        return right_max;
    }
    
    public static int getMaxWaterHold(int [] arr, int [] left, int [] right){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
               int x =Math.min(left[i], right[i]) - arr[i];
               if(x>0)
                   sum+=x;
        }
        return  sum;
    }
    
    
}
