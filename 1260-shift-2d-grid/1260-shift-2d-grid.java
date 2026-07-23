class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k = k % total;

        int[] arr = new int[total];
        int index = 0;

        for (int[] row : grid) {
            for (int ele : row) {
                arr[index++] = ele;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        int x = total - k;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(arr[x % total]);
                x++;
            }

            ans.add(row);
        }

        return ans;
    }
}