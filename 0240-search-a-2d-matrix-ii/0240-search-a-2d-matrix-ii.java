class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        int[] newarr = new int[m*n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            newarr[index++] = mat[i][j];
            }
        }
        Arrays.sort(newarr);

        int low = 0, high = m*n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(newarr[mid] == target){
                return true;
            }else{
                if(newarr[mid] < target) low = mid+1;
                else high = mid - 1;
            }
        }
        return false;
    }
}