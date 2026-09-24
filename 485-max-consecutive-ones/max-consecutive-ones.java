class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, l = 0, r = l;
        int max = 0, cnt = 0;
        while(r < n){
            if(nums[l] == 0) {
                l++;
                cnt = 0;
                r = l;
            }
            else if(nums[r] == 0){
                max = Math.max(max, cnt);
                l = r;
                cnt = 0;
            }
            else if(l == r && nums[l] == 1){
                r++;
                cnt = 1;
            }
            else if(nums[r] == 1){
                r++;
                cnt++;
            }
        }
        max = Math.max(max, cnt);
        return max;
    }
}