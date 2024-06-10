//Modified Moore's voting algo

import java.util.*;
public class Main {
    public static List<Integer> majorityElement(int []v) {
        int e1=0;
        int e2=0;
        int count1=0;
        int count2=0;
        int n=v.length;
        
        for(int i=0;i<n;i++){
            if(count1==0 && v[i]!=e2){
                count1=1;
                e1=v[i];
            }
            else if(count2==0 && v[i]!=e1){
                count2=1;
                e2=v[i];
            }
            else if(e1==v[i])
            count1++;
            
            else if(e2==v[i])
            count2++;
            
            else{
            count1--;
            count2--;
            }
        }
        
        count1=0;
        count2=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(e1==v[i])
            count1++;
            
            else if(e2==v[i])
            count2++;
        }
        
        if(count1 >(n/3))
        ans.add(e1);
        
        if(count2 >(n/3))
        ans.add(e2);
        
        return ans;
}
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}



