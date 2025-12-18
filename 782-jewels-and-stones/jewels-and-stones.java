class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length(), m = jewels.length(), result = 0;
        int[] freq = new int[52];
        for(char c : stones.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                freq[c - 'A']++;
            }
            else freq[(c - 'a') + 26]++;
        }
        for(char ch : jewels.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                result += freq[ch - 'A'];
            }
            else result += freq[(ch - 'a') + 26];
            
        }
        return result;
    }
}