class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int idx = 0;

        for(String s: operations) {
            if(s.equals("+")) {
                scores[idx] = scores[idx - 1] + scores[idx - 2];
                idx++;
            } else if(s.equals("D")) {
                scores[idx] = 2 * scores[idx - 1];
                idx++;
            } else if(s.equals("C")) {
                idx--;
            } else {
                scores[idx] = Integer.parseInt(s);
                idx++;
            }
        }

        int ans = 0;

        for(int i = 0; i < idx; i++) ans += scores[i];

        return ans;
    }
}