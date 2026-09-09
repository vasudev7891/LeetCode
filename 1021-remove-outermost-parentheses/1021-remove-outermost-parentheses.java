class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int d = 0;

        for(char c: s.toCharArray()) {
            if((c == '(' && d > 0) || (c == ')' && d > 1)) ans.append(c);

            if(c == '(') d++;
            if(c == ')') d--;

        }

        return ans.toString();
    }
}