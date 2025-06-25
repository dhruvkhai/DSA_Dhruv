class Solution {
    public boolean isBoomerang(int[][] points) {
        // int x1 = points[0][0]*(points[0][1]-points[1][1]);
        // int x2 = points[1][0]*(points[1][1]-points[2][1]);
        // int x3 = points[2][0]*(points[0][1] - points[1][1]);
        // int area = ;

        int dx1 = points[1][0]-points[0][0];
        int dx2 = points[2][0]-points[1][0];
        int dy1 = points[1][1]-points[0][1];
        int dy2 = points[2][1] -points[1][1];

        // using slope of ab = bc then its linear straight line 

        
        return (dx1 * dy2 != dy1* dx2);
    }
}