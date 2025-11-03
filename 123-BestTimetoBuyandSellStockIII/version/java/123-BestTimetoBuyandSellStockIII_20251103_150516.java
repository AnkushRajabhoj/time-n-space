// Last updated: 03/11/2025, 15:05:16
class Solution {
    public int maxProfit(int[] prices) {

        int minLeft = prices[0];
        int maxRight = prices[prices.length-1];
        int maxProfit = 0;

        int profit[] = new int[prices.length];
        int profit2[] = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            profit[i] = Math.max(prices[i] - minLeft ,profit[i-1]);
            minLeft = Math.min(prices[i], minLeft);
            maxProfit = Math.max(profit[i] + profit2[i], maxProfit);
        }

        for (int i = prices.length-2; i >= 0; i--) {
            profit2[i] = Math.max(maxRight - prices[i] , profit2[i+1]);
            maxRight = Math.max(prices[i], maxRight);
            maxProfit = Math.max(profit[i] + profit2[i], maxProfit);
        }

        return maxProfit;
    }
}