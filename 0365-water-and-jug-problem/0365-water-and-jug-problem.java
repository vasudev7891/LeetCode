class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target == 0) return true;
        if (target > x + y) return false;

        return target % calculateGCD(x, y) == 0;
    }

    private int calculateGCD(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        return x;
    }
}