class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;
        while (left < prices.length && right < prices.length) {
            int prof = prices[right] - prices[left];
            if(prices[right] <= prices[left]){
                left = right;
            }else{
                profit = Math.max(profit, prof);
            }

            right++;
        }

        return profit;
    }
}