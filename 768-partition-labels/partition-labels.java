class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = n-1; i >= 0; i--){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
        }
        int i = 0;
        while(i < n){
            int k = map.get(s.charAt(i));
            map.remove(s.charAt(i));
            int j = i;
            i++;
            while(i <= k){
                if(map.containsKey(s.charAt(i))){
                    k = Math.max(map.get(s.charAt(i)), k);
                    map.remove(s.charAt(i));
                }
                i++;
            }
            list.add(i - j);
        }
        return list;
    }
}