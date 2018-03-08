// I - 1
// V - 5
// X - 10
// L - 50
// C - 100
// D - 500
// M - 1000
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = initMap();
        
        int res = 0;
        int prevVal = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            int val = map.get(s.charAt(i));
            if(val < prevVal) {
                res -= val;
            } else {
                res += val;
            }
            prevVal = val;
        }
        return res;
    }
    
    private Map<Character, Integer> initMap() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
    
}
