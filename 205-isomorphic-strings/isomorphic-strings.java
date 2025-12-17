class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] freqs = new int[256];
        int [] freqt = new int[256];

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(freqs[a] == 0 && freqt[b] == 0){
                freqs[a] = b;
                freqt[b] = a;
            }else{
                if(freqs[a] != b || freqt[b] != a) return false;
            }
        }
        return true;
    }
}