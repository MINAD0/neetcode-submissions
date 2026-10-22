class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int maxProfit = 0;

        
        for (int i=1; i < prices.length; i++){
            if (minP > prices[i]){
                minP = prices[i];
            }else if (maxProfit < prices[i] - minP){
                maxProfit = prices[i] - minP;
            }
        }

        return maxProfit;
    }
}
