class Solution {
    static List<Long>[] palin = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
    static {
        long max = 1_000_000_000L;

        for(int i = 1; i < 100000; i++) {
            String s = String.valueOf(i);
            String r = new StringBuilder(s).reverse().toString();

            long p1 = Long.parseLong(s.substring(0, s.length() - 1) + r);
            long p2 = Long.parseLong(s + r);

            if(p1 < max) palin[(int)(p1 & 1)].add(p1);
            if(p2 < max) palin[(int)(p2 & 1)].add(p2);
        }

        Collections.sort(palin[0]);
        Collections.sort(palin[1]);
    }

    public long minOperations(int[] nums) {
        long ans = 0;

        for(int num: nums) {
            List<Long> p = palin[num & 1];
            int idx = Collections.binarySearch(p, (long)num);

            if(idx < 0) idx = -(idx + 1);
            if(idx >= p.size()) idx = p.size() - 1;

            long d1 = Math.abs(num - p.get(idx));
            long d2 = idx > 0 ? Math.abs(num - p.get(idx - 1)) : d1;
            ans += Math.min(d1, d2) / 2;
        }

        return ans;
    }
}