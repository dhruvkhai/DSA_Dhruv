class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    helper(grid, visited, i, j, delRow, delCol);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void helper(char[][] grid, boolean[][] visited, int row, int col, int[] delRow, int[] delCol){
        int m = grid.length, n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        visited[row][col] = true;
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for(int i = 0; i < 4; i++){
                int nRow = r + delRow[i];
                int nCol = c + delCol[i];

                if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n && grid[nRow][nCol] == '1' && !visited[nRow][nCol]){
                    visited[nRow][nCol] = true;
                    q.add(new int[]{nRow, nCol});
                }
            }
        }
    }
}