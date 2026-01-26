class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // min heap = last me larget value bachegi 
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> Integer.compare(map.get(a), map.get(b)));

        for(int freq : map.keySet()){
            que.add(freq);
            if(que.size() > k) que.poll();
        }

        int[] ans = new int[k];
        int i = 0;
        while(!que.isEmpty()){
            ans[i++] = que.poll();
        }

        return ans;
    }
}