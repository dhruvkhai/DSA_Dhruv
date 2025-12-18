import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        char c[] = s.toCharArray();
        int i = 0;
        while (i < n) {
            if(Character.isDigit(c[i])){
                int k = 0;
                while (Character.isDigit(c[i]) && i < n) {
                    k = (c[i] - '0') + k * 10;
                    i++;
                }
                st.push(String.valueOf(k));
            }
            
            else if (c[i] == ']') {

                StringBuilder sb = new StringBuilder();
                while (!st.peek().equals("[")) {
                    sb.insert(0, st.pop());
                }
                st.pop();

                int k = Integer.parseInt(st.pop());
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    repeated.append(sb);
                }
                st.push(repeated.toString());
                i++;
            }
            else {
                st.push(Character.toString(c[i]));
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        return result.toString();
    }
}