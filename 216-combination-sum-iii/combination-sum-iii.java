import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int k, int remain, int start) {
        // If we found a valid combination
        if (tempList.size() == k && remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // If invalid path
        if (tempList.size() > k || remain < 0) return;

        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            backtrack(result, tempList, k, remain - i, i + 1); // move forward, no reuse
            tempList.remove(tempList.size() - 1); // backtrack
        }
    }
}
