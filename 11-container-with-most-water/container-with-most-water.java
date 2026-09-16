class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int max = 0;
        int i = 0, j = n - 1;
        while(j >= i){
            if(nums[i] < nums[j]){
                max = Math.max(max, nums[i] * (j-i));
                i++;
            }else{
                max = Math.max(max, nums[j] * (j-i));
                j--;
            }
        }
        return max;
    }
}