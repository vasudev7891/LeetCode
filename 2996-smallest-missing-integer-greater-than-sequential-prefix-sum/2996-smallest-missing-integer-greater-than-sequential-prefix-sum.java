class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

        for(int j = 1; j < n; j++) {
            if(nums[j] != nums[j - 1] + 1) break;

            sum += nums[j];
        }

        Set<Integer> set = new HashSet<>();

        for(int x: nums) set.add(x);

        while(set.contains(sum)) sum++;

        return sum;
    }
}