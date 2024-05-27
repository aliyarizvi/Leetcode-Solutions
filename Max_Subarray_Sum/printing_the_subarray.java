class Solution {
    public int[] maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxsum) {
                maxsum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }
        int[] result = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = solution.maxSubArray(nums);
        System.out.println("The maximum subarray is: " + Arrays.toString(result));
    }
}
