import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        func(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }
    void func(int[] candidates, int remaining, List<Integer> list, List<List<Integer>> result, int start){
        if(remaining == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(remaining < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            func(candidates, remaining - candidates[i], list, result , i);
            list.remove(list.size() - 1);
        }
    }
}
