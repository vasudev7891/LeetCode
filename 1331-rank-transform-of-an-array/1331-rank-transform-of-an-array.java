class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;
        
        int[][] arr2 = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr2[i][0] = i;
            arr2[i][1] = arr[i];
        }

        Arrays.sort(arr2, (a, b) -> Integer.compare(a[1], b[1]));

        int rank = 1;

        arr[arr2[0][0]] = rank;

        for (int i = 1; i < n; i++) {
            if (arr2[i][1] != arr2[i - 1][1]) rank++;
            arr[arr2[i][0]] = rank;
        }

        return arr;
    }
}