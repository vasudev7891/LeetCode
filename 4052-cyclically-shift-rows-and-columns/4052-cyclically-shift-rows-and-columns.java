class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                int col = (j - rowShift[i] + n) % n;
                int row = (i - colShift[col] + n) % n;

                ans[row][col] = grid[i][j];
            }
        }

        return ans;
    }
}