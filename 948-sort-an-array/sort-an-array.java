class Solution {
    public int[] sortArray
    (int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        dividing(nums, low, high);
        return nums;
    }
    public static void dividing(int[] nums, int low, int high){
        if( low >= high) return;
        int mid = low + (high - low) / 2;
        dividing(nums, low, mid);
        dividing(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    public static void merge(int[] nums, int low, int  mid, int high){
        ArrayList<Integer> arr = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                arr.add(nums[left]);
                left++;
            }
            else{
                arr.add(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            arr.add(nums[left]);
            left++;
        }
        while(right <= high){
            arr.add(nums[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            nums[i] = arr.get(i - low);
        }
    }
}