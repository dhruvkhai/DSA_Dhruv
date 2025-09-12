import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        // base case: target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // base case: out of bounds
        if (index >= candidates.length) {
            return;
        }

        // Choice 1: include current number (if still valid)
        if (candidates[index] <= target) {
            current.add(candidates[index]);
            backtrack(candidates, target - candidates[index], index, current, result); // reuse allowed
            current.remove(current.size() - 1); // backtrack
        }

        // Choice 2: skip current number
        backtrack(candidates, target, index + 1, current, result);
    }
}
