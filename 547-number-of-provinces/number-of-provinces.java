class Solution {
    public int findCircleNum(int[][] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                provinces++;
                helper(arr,i , visited);
            }
        }
        return provinces;
    }
    public static void helper(int[][] arr, int city, boolean[] visited){
        visited[city] = true;

        for(int j = 0 ; j < arr.length; j++){
            if(!visited[j] && arr[city][j] == 1){
                helper(arr, j, visited);
            }
        }
    }
}