class Solution {
    public String reverseString(String s) {
        char[] ac = s.toCharArray();
        int start = 0;
        int end = ac.length -1;
        while(start < end){
            char tmp = ac[start];
            ac[start] = ac[end];
            ac[end] = tmp;
            start++;
            end--;
        }
        return new String(ac);
    }
}
