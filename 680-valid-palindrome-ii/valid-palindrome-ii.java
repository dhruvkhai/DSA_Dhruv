class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(n == 0 || n == 1) return true;
        int l = 0, r = n-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return val(s,l+1, r) || val(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean val(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}