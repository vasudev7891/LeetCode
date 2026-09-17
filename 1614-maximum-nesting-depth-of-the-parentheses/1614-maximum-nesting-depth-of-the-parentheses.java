class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack();
        int count = 0, ans = 0;

        for(char c: s.toCharArray()) {
            if(c == '(') {
                st.push(c);
                count++;
            }

            ans = Math.max(ans, count);
            
            if(c == ')') {
                st.pop();
                count--;
            }

        }

        return ans;
    }
}