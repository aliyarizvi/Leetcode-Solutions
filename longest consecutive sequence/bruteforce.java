import java.util.*;
public class Main {

    public static boolean linearsearch(int []a,int num){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==num)
            return true;
        }
        return false;
    }
    public static int longestSuccessiveElements(int []a){
        int n=a.length;
        int lon=1;
        for(int i=0;i<n;i++){
            int x=a[i];
            int c=1;
            
            while(linearsearch(a,x+1)==true){
                x+=1;
                c+=1;
            }
            lon=Math.max(lon,c);
        }
        return lon;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
