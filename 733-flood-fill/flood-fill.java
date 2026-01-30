class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int m = image.length, n = image[0].length;
        int[][] ans = image;
        int[] delRow = {-1, 0, +1, 0}; // delta row
        int[] delCol = {0, +1, 0, -1}; // delta col
        helper(iniColor, ans, image, sr, sc, color, delRow, delCol, m, n);
        return ans;
    }
    public void helper(int iniColor, int[][] ans, int[][] image, int sr, int sc, int color, int[] delRow, int[] delCol, int m, int n){
        ans[sr][sc] = color;
        for(int i = 0; i < 4; i++){
            int nRow = sr + delRow[i];
            int nCol = sc + delCol[i];
            if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n && image[nRow][nCol] == iniColor && ans[nRow][nCol] != color){
                helper(iniColor, ans, image, nRow, nCol, color, delRow, delCol, m, n);
            }
        }
    }
}