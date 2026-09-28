class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1 || k == 0) return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 1;
        map.put(nums[l], l);
        while(r < n){
            if(map.containsKey(nums[r]) && Math.abs(r- map.get(nums[r])) <= k){
                return true;
            }else{
                if(map.size() < k){
                    map.put(nums[r], r);
                }else{
                    map.remove(nums[l]);
                    l++;
                    map.put(nums[r], r);
                }
            }
            r++;
        }
        return false;
    }
}