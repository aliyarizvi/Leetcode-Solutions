//Time Complexity=O(N)
//Space Complexity=O(1)

import java.util.*;
public class Main
{
    public static int getLongestSubarray(int []arr, long k){
        int n=arr.length;
        int maxlen=0;
        int sum=0;
        int i=0;
        for(int j=0; j<n; j++){
            sum+= arr[j];
            
            while(i<=j && sum>k){
                sum-= arr[i];
                i++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen, j-i+1);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
