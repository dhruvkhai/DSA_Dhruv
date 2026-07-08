class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid[0].length;
        int total = size * size;
        int[] arr = new int[total];
        int k = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size ; j++){
                arr[k++] = grid[i][j];
            }
        }
        int[] res = new int[2];
        Arrays.sort(arr);
        if(arr[0] != 1) res[1] = 1;
        if(arr[total-1] != total) res[1] = total; 
        for(int i = 1; i < total; i++){
            if(arr[i-1] == arr[i]) res[0] = arr[i];
            if((arr[i] - arr[i-1]) == 2) res[1] = arr[i] - 1;
        }
        return res;
    }
}