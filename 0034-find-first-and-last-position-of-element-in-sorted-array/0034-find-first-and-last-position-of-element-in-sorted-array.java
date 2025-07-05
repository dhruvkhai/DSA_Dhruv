class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0 || nums[0] > target || nums[nums.length-1] < target) return new int[]{-1, -1};
        int start = firstindex(nums,target);
        int end = endindex(nums,target);
        return new int[]{start, end};
        }
        public static int firstindex(int[] nums, int target){
        int low = 0, high = nums.length-1, index = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            }
            else if(nums[mid] != target && nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return index;
        }
        public static int endindex(int[] nums, int target){
        int low = 0, high = nums.length-1, index = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                index = mid;
                low = mid+1;
            }
            else if(nums[mid] != target && nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return index;
        }

}

