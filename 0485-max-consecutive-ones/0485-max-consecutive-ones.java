class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
       
        int max = 0 , cnt = 0;

        for(int i = 0; i< n ; i++){
            if(arr[i] == 1){
                cnt++;
                max = Math.max(max,cnt);
            }else{
                cnt = 0;
            }
                
        }
        
        return max;
    }
}