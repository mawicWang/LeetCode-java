class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0, j = 0, answer = 0;
        while(i < s.length() && j < s.length()) {
            if(map.containsKey(s.charAt(j))) {
                if(map.get(s.charAt(j)) >= i) {
                    i = map.get(s.charAt(j)) + 1;
                } 
            }
            map.put(s.charAt(j), j);
            j++;
            answer = Math.max(answer, j-i);
        }
        return answer;
    }
}
