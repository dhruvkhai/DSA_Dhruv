import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // Map to store first occurrence of a prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case

        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 to -1 to use prefix sum approach
            sum += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
