class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int ones = 0;
        for(char c: s.toCharArray()) {
            if(c == '1') ones++;
        }

        if(ones < k) return "";

        String ans = "";
        int left = 0, count = 0; 

        for(int right = 0; right < s.length(); right++) {
            if(s.charAt(right) == '1') count++;

            while(count > k) {
                if(s.charAt(left) == '1') count--;
                left++;
            }

            if(count == k) {
                while(s.charAt(left) == '0') left++;
                String st = s.substring(left, right + 1); 
                
                if(ans.equals("") 
                || st.length() < ans.length()
                || (st.length() == ans.length() 
                && st.compareTo(ans) < 0)) ans = st;
            } 
        }

        return ans;
    }
}