class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int[] freq = new int[51];

        for(int num : nums) {
            freq[num]++;
        }

        int ans = -1;

        if(k == 1) {
            for(int num : nums) {
                if(freq[num] == 1) ans = Math.max(ans, num);
            }
        } else if(k == n) {
            for(int num : nums) {
                ans = Math.max(ans, num);
            }
        } else {
            int x = nums[0];
            int y = nums[n - 1];

            if(freq[x] == 1) ans = Math.max(ans, x);
            if(freq[y] == 1) ans = Math.max(ans, y);
        }

        return ans;
    }
}