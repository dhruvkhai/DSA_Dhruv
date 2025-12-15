class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length) return false;

        Map<Character, String> map = new HashMap<>();
        int n = s.length(), m = pattern.length();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String sub = word[i];
            if(map.containsKey(c)){
                if(!sub.equals(map.get(c))) return false;
            }
            else if(!map.containsKey(c) && map.containsValue(sub)) return false;
            else{
                map.put(c , sub);
            }
        }
        return true;
    }
}