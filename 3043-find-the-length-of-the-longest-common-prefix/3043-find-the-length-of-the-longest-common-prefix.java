class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int x: arr1) {
            while(x > 0) {
                set.add(x);
                x = x / 10;
            }
        }

        int num = -1;

        for(int x: arr2) {
            while(x > 0) {
                if(set.contains(x)) num = Math.max(num, x);
                x /= 10;
            }
        }

        if(num == -1) return 0;

        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}