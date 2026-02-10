class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.isEmpty()) {
                if (map.containsKey(target - nums[i])) {
                    ans[0] = i;
                    ans[1] = map.get(target - nums[i]);
                    break;
                }
            } 
                map.put(nums[i], i);
        }
        return ans;
    }
}
