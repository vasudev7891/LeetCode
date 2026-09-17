class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int left = 0;
        int ans = 0;

        while (left < n) {
            while (left < n && s.charAt(left) == '1') {
                left++;
            }

            if (left == n) break;

            int right = left;
            int zeroCount = 0;
            int oneCount = 0;

            while (right < n && s.charAt(right) == '0') {
                zeroCount++;
                right++;
            }

            while (right < n && s.charAt(right) == '1') {
                oneCount++;
                right++;
            }

            ans = Math.max(ans, 2 * Math.min(zeroCount, oneCount));

            left = right;
        }

        return ans;
    }
}