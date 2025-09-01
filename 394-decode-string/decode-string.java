class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String str = "";
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                count = count * 10 + (c - '0');
            }
            else if(c == '['){
                strStack.push(str);
                countStack.push(count);
                count = 0;
                str = "";
            }
            else if(c == ']'){
                String str2 = new String();
                int repeat = countStack.pop();
                String prev = strStack.pop();
                for(int j = 0 ; j < repeat ; j++)
                {
                    str2 = str2 + str;
                }
                str = prev + str2;
            }
            else{
                str = str + c ;
            }
        }
        return str;
    }
}






























