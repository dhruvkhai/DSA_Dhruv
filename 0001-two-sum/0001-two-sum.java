class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
  int[] ans = new int[2];
  ans[0] = ans[1] = -1;
  for(int i = 0; i < n; i++){
      int remaining = target - nums[i];
      if(map.containsKey(remaining)){
          ans[0] = map.get(remaining);
          ans[1] = i;
          System.out.println("variant 2: " + ans);
      }
      map.put(nums[i] , i);
  
    }
          return ans;}}