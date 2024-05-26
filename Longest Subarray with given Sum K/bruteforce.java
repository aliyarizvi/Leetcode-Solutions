


import java.util.*;

public class tUf {
    public static int getLongestSubarray(int []a, long k) {
    int n= a.length;
    int maxlen=0;
    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int sum=0;
          for(int k=i; k<=j; k++){
            sum+= a[k];
          }
        if(sum==k){
          maxlen=Math.max(maxlen, j-i+1);
        }
      }
    }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int maxlen = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + maxlen);
    }
}


