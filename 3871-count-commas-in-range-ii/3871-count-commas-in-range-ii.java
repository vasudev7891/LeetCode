class Solution {
    public long countCommas(long n) {

        long[] start = {
            1L,
            1_000L,
            1_000_000L,
            1_000_000_000L,
            1_000_000_000_000L,
            1_000_000_000_000_000L
        };

        long commas = 0;

        for(int i = 1; i < start.length; i++) {

            if(n >= start[i]) {
                long end = Math.min(n, start[i] * 1000 - 1);
                commas += (end - start[i] + 1) * i;
            }
        }

        return commas;
    }
}