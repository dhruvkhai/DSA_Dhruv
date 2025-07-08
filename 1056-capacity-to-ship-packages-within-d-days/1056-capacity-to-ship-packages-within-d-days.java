class Solution {
    public int shipWithinDays(int[] weight, int d) {
        int low = 0, high =0 ;
        for(int i : weight){
            low = Math.max(low,i);
            high += i;
        }

        while(low <= high){
            int i = 1;
            int mid = low + (high - low) /2;
            int cnt = 1;
            int j = 0;
            while(i <= d){
                int  totalweight = 0;
                while(j < weight.length){
                    if((totalweight+weight[j]) <= mid){
                        totalweight += weight[j];
                        j++;
                    } 
                    else break;
                }
                if(j == weight.length) break;
                else i++; cnt++;
            }
        if(cnt<= d) high = mid-1;
        else low = mid+1;
        }
        return low;
    }
}