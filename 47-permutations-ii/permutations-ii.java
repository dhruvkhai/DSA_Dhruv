import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // skip already used element

            // skip duplicates: if nums[i] == nums[i-1] and previous not used, skip
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            curr.add(nums[i]);
            used[i] = true;

            backtrack(nums, used, curr, ans);

            // backtrack step
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
