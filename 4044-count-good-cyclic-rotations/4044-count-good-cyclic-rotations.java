class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long sLeft = 0, sRight = 0;

        for(int i = 0; i < n; i++) {
            if(i < n / 2) sLeft += nums[i];
            else sRight += nums[i];
        }

        int ans = 0;
        int i = 0, j = n / 2;

        while(i < n) {
            if(sLeft > sRight) ans++;

            if(j == n) j = 0;

            sLeft -= nums[i];
            sLeft += nums[j];

            sRight -= nums[j];
            sRight += nums[i];

            i++; j++;
        }

        return ans;
    }
}