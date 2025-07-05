class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        if(nums[nums.length-1] < target) return nums.length;

        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}