class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
    int cnt = 0, maxi = 0;
    List<Integer> list = new ArrayList<>();
    list.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] != nums[i]) {
        list.add(nums[i]);
      }
    }

    for (int i = 0; i < list.size()-1; i++) {
      if (list.get(i) - list.get(i+1) == 1 || list.get(i) - list.get(i+1) == -1) {
        cnt++;
      } else {
        maxi = Math.max(maxi, cnt+1);
        cnt = 0;
      }
    }
    maxi = Math.max(maxi, cnt+1);
    return maxi;
    }
}