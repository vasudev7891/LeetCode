class Solution {
    public int smallestNumber(int n, int t) {

        if(n < t) n = t;

        for(int i = n; i <= n + 10; i++) {
            int num = i;
            int pro = 1;

            while(num > 0) {
                int d = num % 10;
                
                if(d == 0) return i;

                pro *= d;
                num /= 10;
            }

            if(pro % t == 0) return i;
        }

        return 0;
    }
}