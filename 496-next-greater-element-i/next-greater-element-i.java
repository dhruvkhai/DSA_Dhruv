class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums1.length, m = nums2.length;
        int[] arr = new int[m];
        int[] ans = new int[n];
        for (int i = m - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                arr[i] = -1;
            } 
            else{
                if(nums2[i] < st.peek()) arr[i] = st.peek();
                else {
                    while(!st.isEmpty() && nums2[i] > st.peek()){
                        st.pop();
                    }
                    if(!st.isEmpty()) arr[i] = st.peek();
                    else arr[i] = -1;
                }
            }
            st.push(nums2[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j])
                    ans[i] = arr[j];
            }
        }
        return ans;
    }
}