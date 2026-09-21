class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        long ans = 0;
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for(int i = 0; i < intervals.length; i++) {
            int l = i + 1, h = intervals.length;

            while(l < h) {
                int mid = l + (h - l) / 2;
                if(intervals[i][1] < intervals[mid][0]) h = mid;
                else l = mid + 1;
            }

            ans += l - i - 1;
        }

        return ans;
    }
}