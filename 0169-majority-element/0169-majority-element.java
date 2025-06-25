class Solution {
    public int majorityElement(int[] arr) {
       int cnt = 0;
       int n = arr.length;
        int elt = -1; // Initialize elt with a default value

        for(int i = 0; i< n ; i++){
            if(cnt == 0){
                cnt =1;
                elt = arr[i];

            }
            else if(arr[i] == elt){
                cnt++;             
                
            }else cnt--;
                
            
        }

        int cnt1 = 0;
        for(int i = 0 ; i< n ; i++){
            if(arr[i] == elt){
                cnt1++;
            }
            
        }

        if(cnt1 > n/2){
            return elt;
        }
        return -1; 
    }
}