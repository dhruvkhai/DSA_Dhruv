class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        for (int row = 0; row < m; row++) {
            if(check(mat[row],target)){
                return true;
            }
        }
        return false;
    }
    public static boolean check(int[] mat,int target){
        int n = mat.length;
        int low = 0, high = n- 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mat[mid] == target){
                return true;
            }else{
                if(mat[mid] < target) low = mid+1;
                else high = mid - 1;
            }
        }
        return false;
    }
}