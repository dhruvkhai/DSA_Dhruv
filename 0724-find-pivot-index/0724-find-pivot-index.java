class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        
    int totalsum = 0;
    for(int i : arr){
        totalsum += i;
    }
    int leftsum = 0;

    for (int i = 0; i < arr.length; i++) {
            if (leftsum == (totalsum - leftsum - arr[i])) {
            return i;
        }
        leftsum += arr[i];
    }

        return -1; 
    }
}