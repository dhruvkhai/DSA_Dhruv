class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length(), l = 0, r = l + 10 - 1;
        Map<String, Integer> map = new HashMap<>();
        while(r < n){
            String key = s.substring(l,r+1);
            map.put(key , map.getOrDefault(key, 0) +1);
            l++;
            r++;
        }
        List<String> list = new ArrayList();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}