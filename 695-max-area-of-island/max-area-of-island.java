class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    
                    max = Math.max(max, helper(grid, visited,0, i, j, delRow, delCol));
                }
            }
        }
        return max;
    }
    public int helper(int[][] grid, boolean[][] visited, int cnt, int r, int c, int[] delRow, int[] delCol){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        cnt++;
        visited[r][c] = true;

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for(int i = 0 ; i < 4 ; i++){
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];

                if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n && grid[nRow][nCol] == 1 && !visited[nRow][nCol]){
                    cnt++;
                    q.add(new int[]{nRow, nCol});
                    visited[nRow][nCol] = true;
                } 
            }
        }

        return cnt;
    }
}