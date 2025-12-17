class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character, Integer> map = new HashMap<>();
        int start = -1, low = 0, high = 0;
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int remaining = map.size(), minleng = Integer.MAX_VALUE;


        while (high < n) {
            char c = s.charAt(high);
            
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0){
                    remaining--;
                }
            }

            while(remaining == 0){
                char ch = s.charAt(low);
                int leng = high - low + 1;
                if( leng < minleng){
                    minleng = leng;
                    start = low;
                }
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                    if(map.get(ch) > 0 ) remaining++;
                }
                low++;
            }
            high++;
        }    
        if(start == -1) return "";
        return s.substring(start, start + minleng);
    }
}