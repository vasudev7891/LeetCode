class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double ans = 0;
        int i = prices.length - 1;
        int j = discounts.length - 1;

        while(i >= 0 && j >= 0) {
            double finalP = ((double)prices[i] * (100 - (double)discounts[j])) / 100; 
            ans += finalP;
            i--; j--;
        }

        while(i >= 0) {
            ans += prices[i];
            i--;
        }

        return ans;
    }
}