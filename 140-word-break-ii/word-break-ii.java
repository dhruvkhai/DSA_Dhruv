class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        HashSet<String> wordDictMap = new HashSet<>(wordDict);
        func(s, ans, 0, new ArrayList<>(), wordDictMap);
        return ans; 
    }
    void func(String s, List<String> ans, int i, List<String> str, HashSet<String> wordDictMap){
        if(i == s.length()){
            ans.add(String.join(" ", str));
            return;
        }
        for(int j = i+1; j <= s.length(); j++)
        {
            String word = s.substring(i, j);
            if(wordDictMap.contains(word)){
                str.add(word);
                func(s, ans, j, str, wordDictMap);
                str.remove(str.size()- 1);
            }
        }
    }
}