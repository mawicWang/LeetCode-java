class Solution {
    public int myAtoi(String str) {
        List<Character> numbers = Arrays.asList('0','1','2','3','4','5','6','7','8','9');
        List<Character> sign = Arrays.asList('+','-');
        int signFlag = 1;
        
        str = str.trim();
        
        if("".equals(str)) {
            return 0;
        }
        
        if(sign.contains(str.charAt(0))) {
            if(str.length() == 1){
                return 0;
            }

            if(str.charAt(0) == '-') {
                signFlag = -1;
            }
            str = str.substring(1);
        }
        
        
        int res = 0;
        if(numbers.contains(str.charAt(0))) {
            for(int i = 0; i < str.length(); i++) {
                if(!numbers.contains(str.charAt(i))) {
                    break;
                }
                int v = str.charAt(i) - 48;
                if(res > (Integer.MAX_VALUE - v)/10) {
                    return signFlag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res*10 + v;
            }
        } else {
            return 0;
        }
        
        return res*signFlag;
    }
}
