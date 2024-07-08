import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set =new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int s=set.size();
        int j=0;
        for(int i:set){
            arr[j++]=i;
        }
        return s;
    }
}
