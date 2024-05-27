import java.util.*;
public class Main {
    public static int maxSubarraySum(int[] arr, int n) {
        int max=Integer.MIN_VALUE;;
        int check=0;
        for(int i=0;i<n;i++){
            check+=arr[i];
            max=Math.max(max,check);
            
            if(check<0)
            check=0;
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}
