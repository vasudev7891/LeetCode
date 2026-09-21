class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        if(size != m * n) return new int[][]{};

        int[][] ans = new int[m][n]; 

        for(int i = 0; i < size; i++) {
            ans[i / n][i % n] = original[i];
        }    

        return ans;   
    }
}