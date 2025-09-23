class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s.toCharArray(), ans, 0);
        return ans;
    }

    public void backtrack(char[] ch, List<String> ans, int index){
        if(index == ch.length){
            ans.add(new String(ch));
            return;
        }

        if(Character.isDigit(ch[index])){
            backtrack(ch, ans, index + 1);
        }else{
            ch[index] = Character.toUpperCase(ch[index]);
            backtrack(ch, ans, index + 1);

            ch[index] = Character.toLowerCase(ch[index]);
            backtrack(ch, ans, index + 1); 
        }
    }
}