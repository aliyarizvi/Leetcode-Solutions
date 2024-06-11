import java.util.*;
public class Main {

    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n=a.length;
        int hash[] = new int[n+1];
        int r=-1;
        int m=-1;
        
        for(int i=0;i<n;i++){
            hash[a[i]]++;
        }
        
        for(int i=1;i<=n;i++){
            if(hash[i]==0)
            m=i;
            if(hash[i]==2)
            r=i;
            if(r!=-1 && m!=-1)
            break;
        }
        int ans[]={r,m};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}
