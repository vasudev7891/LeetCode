class Solution {
    public int sumDecoded(long[] nums) {
        long sum = 0;
        final int MOD = 1_000_000_007;

        for (long num : nums) {
            int width = (int) (num % 10);
            String d = Long.toString(num / 10);

            long x = 0, y = 0;

            for (int i = 0; i < d.length(); i++) {
                int digit = d.charAt(i) - '0';
                if (i < width) x = x * 10 + digit;
                else y = y * 10 + digit;
            }

            long number = modPow(x, y, MOD);
            sum = (sum + number) % MOD;
        }

        return (int) sum;
    }

    private long modPow(long base, long exp, int mod) {
        base %= mod;
        if (base < 0) base += mod;

        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
        
            base = (base * base) % mod;
            exp >>= 1;
        }
        
        return result;
    }
}