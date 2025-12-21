import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 == 1)
            return false;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty()) return false;
                if (!check(c, st)) return false;
                st.pop();
            }
        }
    
        return st.isEmpty();

    }

    public static boolean check(char c, Stack<Character> st) {
        if ((st.peek() == '(' && c == ')') || (st.peek() == '{' && c == '}') || (st.peek() == '[' && c == ']'))
            return true;
        return false;
    }
}