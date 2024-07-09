import java.util.*;
public class Main {
    static int findMaxConsecutiveOnes(int nums[]) {
        int maxi=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1)
            count++;
            else
            count=0;
            
            maxi=Math.max(count,maxi);
        }
        return maxi;
    }
    public static void main(String args[]) {
        int nums[] = { 1, 1, 0, 1, 1, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
