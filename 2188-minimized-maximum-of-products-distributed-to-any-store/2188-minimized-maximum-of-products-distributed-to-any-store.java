class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int i : quantities){
            high = Math.max(high,i);
        }
        int result = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(check(n,quantities,mid)  <= n){
                result = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return result;
    }
    public static int check(int n, int[] quantities,int mid){
        int count = 0;
        for(int  i : quantities){
            if(i%mid == 0) count += i/mid ;
            else count += i/mid + 1;
        }
        return count;
    }
}