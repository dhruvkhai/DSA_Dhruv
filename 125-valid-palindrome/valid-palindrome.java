class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a'  && c <= 'z') str.append(c);
            else if(Character.isUpperCase(c)) str.append(Character.toLowerCase(c));
            else if(Character.isDigit(c)) str.append(c);
        }
        int n = str.length();
        if(n == 1) return true;
        int i = 0, j = n - 1;
        while(i <= j){
            if(checkPalindrome(str, i, j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public static boolean checkPalindrome(StringBuilder str, int i, int j){
        if(str.charAt(i) == str.charAt(j)) return true;
        else return false;
    }
}