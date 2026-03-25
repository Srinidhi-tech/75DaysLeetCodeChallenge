class Solution {
    public int maxProfit(int[] prices) {
        // Initialize minPrice to a very large value
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // We found a new historical low
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Selling today gives us a better profit than before
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}