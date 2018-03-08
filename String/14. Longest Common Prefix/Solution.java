class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int minLength = Integer.MAX_VALUE;
        for(int n = 0; n < strs.length; n++) {
            minLength = Math.min(minLength, strs[n].length());
        }
        
        for(int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(c != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0].substring(0, minLength);

    }
}
