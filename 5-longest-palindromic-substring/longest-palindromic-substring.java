class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 1) return s;
        String longest = "";
        int low = 0, high = 0;
        for(int i = 1; i < n ; i++){
            low = i;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == n)break;
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > longest.length()) longest = palindrome;

            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == n)break;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > longest.length()) longest = palindrome;
        } 
        return longest;
    }
}
