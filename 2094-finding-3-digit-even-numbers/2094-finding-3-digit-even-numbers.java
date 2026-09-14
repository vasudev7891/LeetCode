class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        List<Integer> list = new ArrayList<>();

        for(int digit: digits) freq[digit]++;

        for(int h = 1; h <= 9; h++) {
            if(freq[h] == 0) continue;
            freq[h]--;

            for(int t = 0; t <= 9; t++) {
                if(freq[t] == 0) continue;
                freq[t]--;

                for(int o = 0; o <= 8; o += 2) {
                    if(freq[o] == 0) continue;
                    list.add(h * 100 + t * 10 + o);
                }

                freq[t]++;
            }

            freq[h]++;
        }

        int ans[] = new int[list.size()];

        for(int i = 0; i < ans.length; i++) ans[i] = list.get(i);

        return ans;
    }
}