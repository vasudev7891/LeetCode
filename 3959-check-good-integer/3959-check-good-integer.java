class Solution {
    public boolean checkGoodInteger(int n) {
        long digitSum = 0, squareSum = 0; 

        while(n > 0) {
            int d = n % 10;
            digitSum += d;
            squareSum += d * d;
            n /= 10;
        }

        if((squareSum - digitSum) >= 50 ) return true;

        return false;
    }
}