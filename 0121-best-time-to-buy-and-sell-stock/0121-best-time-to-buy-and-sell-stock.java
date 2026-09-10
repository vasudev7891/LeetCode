class Solution {
    public int maxProfit(int[] price) {
        int profit = 0, maxPro = 0, minPrice = price[0];

        for(int i = 1; i < price.length; i++){

            if(price[i] > minPrice) profit = price[i] - minPrice;
            else minPrice = price[i];

            maxPro = Math.max(maxPro, profit);
        }

        return maxPro;
    }
}