class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2 * nums.length];

        int i = 0, j = ans.length - 1;

        for(int num: nums) {
            ans[i++] = num;
            ans[j--] = num;
        }

        return ans;
    }
}