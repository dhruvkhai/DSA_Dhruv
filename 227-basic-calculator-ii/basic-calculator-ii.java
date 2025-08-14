class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char operator = '+';
        int number = 0;

        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }

            if((!Character.isDigit(c) && c != ' ') || i == s.length() - 1){
                switch(operator){
                    case '+':
                        st.push(number);
                        break;
                    
                    case '-':
                        st.push(-1 * number);
                        break;

                    case '*':
                        st.push(number * st.pop());
                        break;

                    case '/':
                        st.push(st.pop() / number);
                        break;
                }
                operator = c;
                number = 0;
            }
        }
        int sum = 0; 
        while(!st.isEmpty()){
            sum = sum + st.pop();
        }
        return sum;
    }
}











