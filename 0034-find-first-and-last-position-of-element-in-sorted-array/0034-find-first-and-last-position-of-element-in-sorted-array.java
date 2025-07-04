class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0) {
        return new int[]{-1, -1};
        }

        int i = 0, start = -1, end = -1;
        while(i<nums.length){
            if(nums[i] == target){
                start = i;
                while(i<nums.length){
                    if(nums[i] == target) end = i;
                    i++;
                }
            } 
            i++;
        }

        return new int[]{start, end};
    }
}

