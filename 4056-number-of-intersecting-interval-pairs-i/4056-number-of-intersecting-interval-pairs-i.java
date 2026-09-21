class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for(int i = 0; i < intervals.length; i++) {
            for(int j = i + 1; j < intervals.length; j++) {
                if(intervals[i][1] >= intervals[j][0]) ans++;
                else break;
            }
        }

        return ans;
    }
}