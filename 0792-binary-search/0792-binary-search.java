class Solution {
    public int search(int[] nums, int target) {
        if(nums[nums.length - 1] < target) return -1;
        int result = searching(nums, target,0,nums.length-1);
        return result;    
    }
    public static int searching(int[] nums, int target, int low, int high){
        if(low>high) return -1;
        int mid = (low + high)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return searching(nums, target,mid+1,high);
        else return searching(nums, target,low,mid-1);
        
    }
}