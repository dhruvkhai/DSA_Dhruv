class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[] freq = new int[26];
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }
        int l = 0, r = l+n-1;
        while(r < m){
            int[] freq1  = new int[26];
            for(int start = l; start <= r; start++){
                freq1[s2.charAt(start) - 'a']++;
            }
            if(Arrays.equals(freq, freq1)){
                return true;
            }
            l++;
            r++;
        }
        return false;
    }
}