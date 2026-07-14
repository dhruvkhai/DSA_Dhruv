class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    Arrays.sort(nums);
    
    for (int i = 0; i < nums.length - 2; i++) {
        // Skip duplicates for the first element
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        
        Set<Integer> seen = new HashSet<>();
        for (int j = i + 1; j < nums.length; j++) {
            int complement = -nums[i] - nums[j];
            if (seen.contains(complement)) {
                res.add(Arrays.asList(nums[i], complement, nums[j]));
                // Skip duplicates for the second element
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }
            seen.add(nums[j]);
        }
    }
    return new ArrayList<>(res);
}
}