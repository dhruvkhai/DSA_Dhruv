class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], move both pointers forward
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Element is in the right place, just move mid forward
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] and nums[high], decrease high boundary
                swap(nums, mid, high);
                high--;
                // Do NOT increment mid here, because the newly swapped element 
                // at mid needs to be evaluated in the next iteration.
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}