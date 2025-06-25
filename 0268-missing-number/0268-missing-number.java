class Solution {
    public int missingNumber(int[] arr) {
        
        int N = arr.length;
        
        int xor1 = 0;
        int xor2 = 0; 
        for(int i = 0; i< N;i++){
            xor2 = xor2^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        // xor1 = xor1^N;
        return xor1^xor2;
    }
    // public int missingNumber(int[] arr) {
    //     int N = arr.length;
    //     int xor1 = 0;
    //     int xor2 = 0; 
    //     for(int i = 0; i < N; i++){   // loop till i < N
    //         xor2 = xor2 ^ arr[i];
    //         xor1 = xor1 ^ (i+1);
    //     }
    //     return xor1 ^ xor2;
    // }
}