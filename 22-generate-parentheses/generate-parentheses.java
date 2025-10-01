import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] str = new char[n*2];
        func(ans,0, str,n,n);
        return ans;
    }

    public void func(List<String> ans, int start, char[] str, int open, int close){
        if(open == 0 && close == 0){
            ans.add(new String(str));
            return;
        }
        if(open > 0){
            str[start] = '(';
            func(ans, start+1, str, open-1, close);
        }
        if(close > open){
            str[start] = ')';
            func(ans, start+1, str, open, close-1);
        }
    }
}
