import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, String cur, int open, int close, int max) {
        // If the string is complete
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        // If we can still add an opening bracket
        if (open < max) {
            backtrack(ans, cur + "(", open + 1, close, max);
        }

        // If we can add a closing bracket
        if (close < open) {
            backtrack(ans, cur + ")", open, close + 1, max);
        }
    }
}
