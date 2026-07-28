class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                middle = (char) (i + 'a');
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                ans.append((char) (i + 'a'));
            }
        }

        String left = ans.toString();

        if(middle != 0) ans.append(middle);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}