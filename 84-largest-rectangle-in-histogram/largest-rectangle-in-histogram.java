class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxi = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i] ){
                int height = arr[st.pop()] ; 
                int width = st.isEmpty() ? i : i - st.peek() - 1 ;
                maxi = Math.max(maxi, height * width);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int height = arr[st.pop()] ; 
            int width = st.isEmpty() ? n : n - st.peek() - 1 ;
            maxi = Math.max(maxi, height * width);
        }
        return maxi;
    }
}
