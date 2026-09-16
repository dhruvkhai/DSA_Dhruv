class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int srt = 0, mid = 0, end = n-1;

        while(mid <= end){
            if(nums[mid] == 0){
                int temp = nums[srt];
                nums[srt] = nums[mid];
                nums[mid] = temp;

                srt++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}