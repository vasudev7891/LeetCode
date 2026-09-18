class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder st = new StringBuilder();
        int top = 0;
        int n = part.length();

        for(char c: s.toCharArray()) {
            st.append(c);
            top++;

            if(c == part.charAt(n - 1) && top >= n) {
                int k = top - 1;
                int x;
                for(x = n - 1; x >= 0; x--) {
                    if(part.charAt(x) != st.charAt(k)) break;
                    k--;
                }

                if(x == -1) {
                    for(int y = 0; y < n; y++) {
                        st.deleteCharAt(st.length() - 1); 
                        top--;
                    }
                }

            }
        }

        return st.toString();
    }
}