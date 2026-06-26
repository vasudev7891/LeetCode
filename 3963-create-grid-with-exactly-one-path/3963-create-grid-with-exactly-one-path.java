class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        int k = 0;

        for(int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n; j++) {
                if(i == 0 || j == n - 1) sb.append(".");
                else sb.append("#");
            }

            grid[k++] = sb.toString();
        }

        return grid;
    }
}