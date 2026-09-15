class Solution {
    public int largestInteger(int num) {
        Queue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> digits = new ArrayList<>();

        while(num > 0) {
            int d = num % 10;
            digits.add(d);

            if(d % 2 == 0) even.offer(d);
            else odd.offer(d);

            num /= 10;
        }

        int ans = 0;
        int i = digits.size();

        while(i > 0) {
            if(digits.get(--i) % 2 == 0) ans = ans * 10 + even.poll();
            else ans = ans * 10 + odd.poll();
        }

        return ans;
    }
}