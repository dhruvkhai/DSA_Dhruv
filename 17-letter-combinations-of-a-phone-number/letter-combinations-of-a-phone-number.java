class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");


        func(digits, new StringBuilder(), 0, ans, map);
        return ans;
    }

    void func(String digits, StringBuilder temp, int index, List<String> ans, Map<Character, String> map ){
        if(index == digits.length()){
            ans.add(temp.toString());
            return;
        }

        char ch = digits.charAt(index);
        String letters = map.get(ch);
        for(char letter : letters.toCharArray())
        {
            temp.append(letter);
            func(digits, temp, index+1, ans, map);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}