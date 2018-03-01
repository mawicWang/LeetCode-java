class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int v = x%10;
            int abv = Math.abs(v);
            if(res > (Integer.MAX_VALUE - abv)/10 || res < (Integer.MIN_VALUE + abv)/10) {
                return 0;
            }
            res = res*10 + v;
            x = x/10;
        }
        
        return res;
    }
}
