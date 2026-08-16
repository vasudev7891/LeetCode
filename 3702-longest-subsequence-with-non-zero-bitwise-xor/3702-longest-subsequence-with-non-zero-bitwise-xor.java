class Solution {
    public int longestSubsequence(int[] nums) {
        int tXOR = 0;
        boolean nonZero = false;

        for(int num: nums) {
            tXOR ^= num;
            nonZero |= num > 0; 
        }

        if(tXOR > 0) return nums.length;

        if(nonZero) return nums.length - 1;

        return 0;
    }
}