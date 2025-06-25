class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
        int left = i;
        int right = nums[left];
            if(left == right){
                ans[i] = nums[left];
            }
            else if(left!= right){
                ans[left] = nums[right];
            }
        }
        return ans;
    }
}