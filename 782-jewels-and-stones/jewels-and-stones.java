class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : stones.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : jewels.toCharArray()){
            if(map.containsKey(ch)){
                cnt += map.get(ch);
                System.out.println(cnt);
            }
        }
        return cnt;
    }
}