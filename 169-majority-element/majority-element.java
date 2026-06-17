class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 2) return nums[0];
        Arrays.sort(nums);
        int ans  = 0;
        for(int i = 0; i < n; i++){
            int j = i ;
            while(j <= n-2 && nums[i] == nums[j+1]){
                j++;
            }
            if((j-i+1) > n/2) {
                ans = nums[i];
                 break;
            }
        }
        return ans;
    }
}