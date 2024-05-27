import java.util.*;
public class Main {
    public static int majorityElement(int []arr) {
    int n=arr.length;
    int c=0;
    int c1=0;
    int ele=0;
    
    for(int i=0;i<n;i++){
        if(c==0){
            c=1;
            ele=arr[i];
        }
        
        else if(arr[i]==ele)
        c++;
        
        else
        c--;
    }
    
    for(int i=0;i<n;i++){
        if(ele==arr[i])
        c1++;
    }
    if(c1> (n/2))
    return ele;
    
    return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}
