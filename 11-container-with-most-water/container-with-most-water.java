class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int l = 0, r = n-1;
        while(l < r){
            int area = 0;
            if(height[l] < height[r]){
                area = height[l] * (r-l);
                l++;
            }
            else{
                area = height[r] * (r-l);
                r--;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}