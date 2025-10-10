import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    void backtrack(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> result) {
        // base case: if permutation complete
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // explore all possibilities
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // skip already used elements

            used[i] = true;              // choose
            curr.add(nums[i]);           // add element

            backtrack(nums, curr, used, result); // recurse

            // backtrack
            used[i] = false;             
            curr.remove(curr.size() - 1);
        }
    }
}
