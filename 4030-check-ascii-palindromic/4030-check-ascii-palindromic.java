class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            String binary = String.format("%8s",
                            Integer.toBinaryString((int)c))
                            .replace(' ', '0');
            sb.append(binary);
        }

        int i = 0, j = sb.length() - 1;

        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }
}