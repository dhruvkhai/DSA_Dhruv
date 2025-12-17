class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char [ ] c1 = s.toCharArray();
        char [ ] c2 = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(c1[i])){
                if(map.get(c1[i]) != c2[i]) return false;
            }
            else if(!map.containsKey(c1[i])){
                if(!map.containsValue(c2[i])){
                    map.put(c1[i], c2[i]);
                }
                else return false;
            }
        }
        return true;
    }
}