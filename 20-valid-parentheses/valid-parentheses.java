import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 == 1)
            return false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!st.isEmpty()) {
                if(isValid(c, st)){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        return st.isEmpty();
    }
    public boolean isValid(char c, Stack<Character> st){
        return (st.peek() == '(' && c == ')') || (st.peek() == '[' && c == ']') || (st.peek() == '{' && c == '}');
    }
}