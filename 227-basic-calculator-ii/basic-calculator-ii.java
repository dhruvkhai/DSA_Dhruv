// class Solution {
//     public int calculate(String s) {
//         Stack<Integer> st = new Stack<>();
//         char token = ' ';
//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if(Character.isDigit(c)){
//                 int num = 0;
//                 while (i < s.length() && Character.isDigit(s.charAt(i))) {
//                     num = num * 10 + (s.charAt(i) - '0');
//                     i++;
//                 }
//                 st.push(num);
//                 token = s.charAt(i+1);
//                 i--;
//             }
            
            

//             else if(c == '+' || c == '-' || c == '*' || c == '/'){
//                 int a = st.pop();
//                 int b = st.pop();
//                 int res = 0;
//                 switch(c){
//                     case '+':
//                         res = a+b;
//                         break;
                    
//                     case '-' :
//                         res = b-a;
//                         break;
                    
//                     case '*' :
//                         res = a*b;
//                         break;
                    
//                     case '/' :
//                         res = a/b;
//                         break;
//                 }
//                 st.push(res);
//             }
//         }
//         return st.peek();
//     }
// }












import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char lastOp = '+'; // last seen operator

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If digit, build the number
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            // If operator (or end of string), process previous number
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                switch (lastOp) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                lastOp = c; // update the last seen operator
                num = 0;    // reset number
            }
        }

        // Sum up all numbers in stack
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
