import java.util.*;
public class Main {

    public static int longestSuccessiveElements(int []a){
        int n=a.length;
        int longest=1;
        
        Set<Integer> set=new HashSet<>();
        for (int i= 0;i< n;i++) {
            set.add(a[i]);
        }
        
        for(int s:set){
            if(!set.contains(s-1)){
                int count=1;
                int x=s;
                
                while(set.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }return longest;
        
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
