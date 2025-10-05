import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), ans, used);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] used) {
        if(curr.size() == nums.length ){
            if(!ans.contains(new ArrayList<>(curr))){
                ans.add(new ArrayList<>(curr));
            }
            return ;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(used[i]) continue;
            curr.add(nums[i]);
            used[i] = true;
            backtrack(nums, curr, ans, used);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
