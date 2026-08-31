class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        int case1 = maxIdx + 1;
        int case2 = n - minIdx;
        int case3 = (minIdx + 1) + (n - maxIdx);

        return Math.min(case1, Math.min(case2, case3));
    }
}