class Solution {
    public int trap(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i = 0; i < n; i++){
            if(st.isEmpty()) st.push(nums[i]);
            if(st.peek() < nums[i]){
                st.push(nums[i]);
            }
            left[i] = st.peek();
        }
        st.clear();

        for(int i = n-1; i >= 0; i--){
            if(st.isEmpty()) st.push(nums[i]);
            if(st.peek() < nums[i]){
                st.push(nums[i]);
            }
            right[i] = st.peek();
        }
        int total = 0;
        for(int  i = 0; i < n ; i++ ){
            total += Math.min(right[i] , left[i]) - nums[i];
        }
        return total;
    }    
}
