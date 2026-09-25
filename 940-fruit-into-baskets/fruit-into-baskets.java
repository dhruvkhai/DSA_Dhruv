import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruit = 0;
        
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++; 
            }
            
            maxFruit = Math.max(maxFruit, right - left + 1);
        }
        
        return maxFruit;
    }
}
