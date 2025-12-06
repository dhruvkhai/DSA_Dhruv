class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = startFunc(nums, target);
        res[1] = endFunc(nums, target);
        return res;

    }
    public static int startFunc(int[] nums, int target){
        int low = 0, high = nums.length-1, start = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                start = mid;
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return start;
    }
    public static int endFunc(int[] nums, int target){
        int low = 0, high = nums.length-1, end = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                end = mid;
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return end;
    }
}

