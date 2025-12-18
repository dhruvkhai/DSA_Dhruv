class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        while(!map.isEmpty()){
            int max = Integer.MIN_VALUE;
            char maxKey = 0;
            for(Map.Entry<Character, Integer> entry :  map.entrySet()){
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            for(int j = 0; j < max; j++){
                sb.append(maxKey);
            }
            map.remove(maxKey);
        }
        return sb.toString();
    }
}