import java.util.*;
public class Main {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; 
        int c = 0;

        for (int i = 0 ; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) { 
                sum += arr[j];
                if (sum == k)
                    c++;
            }
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

