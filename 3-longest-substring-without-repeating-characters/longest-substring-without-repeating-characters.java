class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int l = 0, max = 0 ;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int r = 0 ; r < s.length(); r++){
            if(!set.contains(arr[r])){
                set.add(arr[r]);
            }
            else{
                set.clear();
                l = l + 1;
                r = l;
                set.add(arr[r]);
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}