class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            char key = 0;
            int maxVal = 0;
            boolean found = false;
            for(Map.Entry<Character,Integer> entry : map.entrySet()){

                char ch = entry.getKey();
                int freq = entry.getValue();

                if(freq > maxVal){
                    if((sb.length() > 0 && sb.charAt(sb.length()-1) == ch)) continue;
                    key = ch; 
                    maxVal = freq;
                    found = true;
                }
                
            }
            if(!found) return "";
            sb.append(key);
            map.put(key, map.get(key) -1);
            if(map.get(key) == 0) map.remove(key);
        }
        return sb.toString();
    }
}