class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n ; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i%n]){
                st.pop();
            }
            ans[i%n] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i%n]);
        }
        return ans;
    }
}