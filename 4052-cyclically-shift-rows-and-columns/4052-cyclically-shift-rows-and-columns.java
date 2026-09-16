class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i = 0; i < n; i++) {
            int times = rowShift[i] % n;

            for(int j = 0; j < times; j++) {
                int first = grid[i][0];
                for(int k = 1; k < n; k++) {
                    grid[i][k - 1] = grid[i][k];
                }
                grid[i][n - 1] = first;
            }
        }

        for(int i = 0; i < n; i++) {
            int times = colShift[i] % n;

            for(int j = 0; j < times; j++) {
                int first = grid[0][i];
                for(int k = 1; k < n; k++) {
                    grid[k - 1][i] = grid[k][i];
                }
                grid[n - 1][i] = first;
            }
        }

        return grid;
    }
}