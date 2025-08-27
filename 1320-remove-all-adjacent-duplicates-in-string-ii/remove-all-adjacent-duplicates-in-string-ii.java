class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek()[0] == c) st.peek()[1]++;
            else{
                st.push(new int[]{c,1});
            } 

            if(st.peek()[1] == k) st.pop();

        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            int[] top = st.pop();
            for (int i = 0; i < top[1]; i++) {
                str.append((char) top[0]);
            }
        }
        return str.reverse().toString();
    }
}