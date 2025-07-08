class Solution {
    public int minDays(int[] bloomday, int m, int k) {
        if (bloomday.length < (long) m * k) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i : bloomday) {
            low = Math.min(low, i);
            high = Math.max(high, i);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(canmake(bloomday,m,k,mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean canmake(int[] bloomday, int m, int k , int day){
        int flower = 0, bouquet = 0;
        for(int bloom : bloomday){
            if(bloom <= day){
                flower++;
                if(flower == k){
                    bouquet++;
                    flower = 0;
                }
            }
            else{
                flower = 0;
            }
        }
        return bouquet >= m;
    }
}