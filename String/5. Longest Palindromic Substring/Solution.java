class Solution {
    public String longestPalindrome(String s) {
        int i = 0, j = 0, n = s.length();
        String res = "";
        while(j < n) {
            int p = i, q = j;
            while(p >= 0 && q < s.length() && s.charAt(p) == s.charAt(q)) {
                p--;
                q++;
            }
            // result length = q - p - 1;
            if(q - p - 1 > res.length()){
                // res index L = p + 1, R = q -1;
                res = s.substring(p + 1, q);
            }
            
            if(i == j) {
                j++;
            } else {
                i++;
            }
        }
        return res;
    }
}
