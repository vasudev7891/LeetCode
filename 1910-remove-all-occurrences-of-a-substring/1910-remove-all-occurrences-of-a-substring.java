class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder st = new StringBuilder();
        int n = part.length();

        for (char c : s.toCharArray()) {
            st.append(c);

            if (c == part.charAt(n - 1) && st.length() >= n) {
                int k = st.length() - 1;
                int i;

                for (i = n - 1; i >= 0; i--) {
                    if (part.charAt(i) != st.charAt(k)) break;
                    k--;
                }

                if (i == -1) {
                    for (int j = 0; j < n; j++) {
                        st.deleteCharAt(st.length() - 1);
                    }
                }
            }
        }

        return st.toString();
    }
}