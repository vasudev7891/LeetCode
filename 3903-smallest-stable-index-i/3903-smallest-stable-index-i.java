class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minSuff = new int[n];
        minSuff[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            minSuff[i] = Math.min(nums[i], minSuff[i + 1]);
        }

        int curr = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            curr = Math.max(curr, nums[i]);

            int score = curr - minSuff[i];

            if(score <= k) return i;
        }

        return -1;
    }
}