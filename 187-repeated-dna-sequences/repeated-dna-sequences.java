class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length(), l = 0, r = l + 10 - 1;
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        while(r < n){
            String key = s.substring(l,r+1);
            if(!seen.add(key)){
                repeated.add(key);
            }
            l++;
            r++;
        }
        List<String> list = new ArrayList(repeated);
        return list;
    }
}