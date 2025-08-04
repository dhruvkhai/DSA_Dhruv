class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[ ] ans = new int[nums1.length];
        for(int j = 0; j < nums2.length; j++){
            while(!st.isEmpty() && st.peek() < nums2[j]){
                map.put(st.pop(), nums2[j]);
            }
            st.push(nums2[j]);
        }
        for(int it : st){
            map.put(it, -1);
        }
        for(int i = 0; i < nums1.length ; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}