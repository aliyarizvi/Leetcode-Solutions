import java.util.*;
public class Main {

    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n=a.length;
        int m=-1;
        int r=-1;
        
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[j]==i)
                count++;
            }
            
            if(count == 2)
            r=i;
            if(count == 0)
            m=i;
            if(m!=-1 && r!=-1)
            break;
        }
        int ans[] = {r,m};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}
