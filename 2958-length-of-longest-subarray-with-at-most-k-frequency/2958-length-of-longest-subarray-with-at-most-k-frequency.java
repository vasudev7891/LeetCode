class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int ans = 1, l = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int r = 0; r < n; r++) {
            int x = nums[r];
            freq.put(x, freq.getOrDefault(x, 0) + 1);

            while(freq.get(x) > k) {
                int y = nums[l];

                freq.put(y, freq.get(y) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}