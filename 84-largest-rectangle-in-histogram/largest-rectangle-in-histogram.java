class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int  area = 0;
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && height[st.peek()] >= height[i]) st.pop();
            left[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && height[st.peek()] >= height[i]) st.pop();
            right[i] = (st.isEmpty()) ? n : st.peek();
            st.push(i);
        }

        for(int i = 0; i < n ; i++){
            int currarea = 0;
            currarea = height[i] * (right[i] - left[i] - 1);
            area = Math.max(area, currarea);
        }


        return area;
    }
}
