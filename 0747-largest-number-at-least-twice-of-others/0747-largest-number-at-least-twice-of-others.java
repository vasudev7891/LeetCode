class Solution {
    public int dominantIndex(int[] nums) {
        int idx = -1;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                idx = i;
                largest = nums[i];
            }
        }

        for(int num: nums) {
            if(num == largest) continue;
            if(2 * num > largest) return -1;
        }

        return idx;
    }
}