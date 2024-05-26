import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		Map<Integer, Integer> preSum= new HashMap<>();
		int n=nums.length;
		int sum=0;
		int maxlen=0;
		for(int i=0; i<n; i++){
			sum+= nums[i];
			if(sum==k){
				maxlen= Math.max(maxlen, i+1);
			}

			int rem= sum-k;

			if(preSum.containsKey(rem)){
				int len= i-(preSum.get(rem));
				maxlen= Math.max(maxlen, len);
			}

			if(!preSum.containsKey(sum)){
				preSum.put(sum,i);
			}
		}
		return maxlen;
	}
}
