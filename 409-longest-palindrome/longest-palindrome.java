class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int[] freq = new int[52];
        for(char c : s.toCharArray()){
            if(c >= 'A' && 'Z' >= c){
                freq[c - 'A']++;
            }
            if(c >= 'a' && 'z' >= c){
                freq[(c - 'a' )+ 26]++;
            }
        }
        int cnt = 0;
        boolean used = false;
        for(int i = 0 ; i < freq.length; i++){
            cnt += (freq[i] / 2) * 2;
            if(freq[i] % 2 == 1 && !used){
                cnt++;
                used = true;
            }
        }
        return cnt;
    }
}