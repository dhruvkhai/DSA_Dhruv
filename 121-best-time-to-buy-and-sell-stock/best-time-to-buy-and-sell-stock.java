class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0], sell =prices[0] ;
        int max = 0;
        for (int i = 1 ; i < n ; i++){
            if(prices[i] < buy){
                buy = prices[i];
                sell = buy; 
            }
            else if(prices[i] > buy && prices[i] > sell) sell = prices[i];
            max = Math.max(max, sell - buy);
        }
        return max;
    }
}