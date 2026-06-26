class Solution {
    public boolean checkGoodInteger(int n) {
        long sum = 0, squareSum = 0; 

        while(n > 0) {
            int d = n % 10;
            sum += d;
            squareSum += d * d;
            n /= 10;
        }

        return squareSum - sum >= 50 ? true : false;
    }
}