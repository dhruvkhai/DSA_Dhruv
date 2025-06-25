class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right= n-1;
        int[] ans = new int[2];
        while(left<right){
            int sum = arr[left] + arr[right];

            if (sum == target){
                ans[0] = left+1;
                ans[1] = right+1;
            }
            if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}