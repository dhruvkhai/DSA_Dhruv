class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr_sum = nums[0];
        int max = nums[0];
        for(int i = 1; i<n ; i++){
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);
            max = Math.max(max, curr_sum);
        }
        return max;
    }
}