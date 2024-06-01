import java.util.*;
public class Main {

    public static int longestSuccessiveElements(int []a){
        int n=a.length;
        int lastno=Integer.MIN_VALUE;
        int count=0;
        int longest=1;
        Arrays.sort(a);
        
        for(int i=0;i<n;i++){
            if(a[i]==lastno+1){
            count++;
            lastno=a[i];
            }
            else if(lastno!=a[i]){
                count=1;
                lastno=a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
