import java.util.*;
public class Main {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; 
        Map map = new HashMap();
        int Sum = 0, c = 0;

        map.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            Sum += arr[i];
            int rem = Sum - k;
          
            c += map.getOrDefault(rem, 0);
            map.put(Sum, map.getOrDefault(Sum, 0) + 1);
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}

