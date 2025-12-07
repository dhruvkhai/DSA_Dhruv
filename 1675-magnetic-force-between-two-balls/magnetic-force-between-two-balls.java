class Solution {
    public int maxDistance(int[] pos, int m) {
        int n = pos.length;
        if(m > n) return -1;
        Arrays.sort(pos); // 🔧 Important!
        int low = 1, high = pos[pos.length - 1] - pos[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(check(pos, m, mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean check(int[] pos, int m, int minDist){
        int lastpos = pos[0];
        int ballsPlaced = 1;
        for(int i = 1; i < pos.length; i++){
            if(pos[i] - lastpos >= minDist){
                ballsPlaced++;
                lastpos = pos[i];
            }
            if(ballsPlaced >= m) return true;
        }
        return false;
    }
}


