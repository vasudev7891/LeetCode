class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        int[] prefixGcd = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) sum += gcd(prefixGcd[l++], prefixGcd[r--]);
            
        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
        
            int temp = a;
            a = b;
            b = temp;
        }

        return a;
    }
}