class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return true;
        int left = 0, right = s.length()-1;
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        while(left <= right){
            char cl = arr[left], cr = arr[right];

            if(((cl <='z' && cl >= 'a') || (cl >= '0' && cl <= '9')) && ((cr <='z' && cr >= 'a') || (cr >= '0' && cr <= '9')) ){
                if(cl != cr) return false;
                else{
                    left++;
                    right--;
                }
            }
            else if(!((cl <='z' && cl >= 'a') || (cl >= '0' && cl <= '9'))) left++;
            else if(!((cr <='z' && cr >= 'a') || (cr >= '0' && cr <= '9'))) right--;
        }
        return true;
    }
}