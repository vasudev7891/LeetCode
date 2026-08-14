class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0;
        int ans = 0;
        
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq[c - 'a']++;
            
            while(freq[c - 'a'] > 2) {
                char d = s.charAt(l);
                freq[d - 'a']--;
                l++;
            }
            
            ans = Math.max(ans, r - l + 1);
        }
        
        return ans;
    }
}