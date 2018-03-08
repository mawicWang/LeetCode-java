// I - 1
// V - 5
// X - 10
// L - 50
// C - 100
// D - 500
// M - 1000
class Solution {
    public String intToRoman(int num) {
        String k[][] = {
            {"","M","MM","MMM"},
            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"","I","II","III","IV","V","VI","VII","VIII","IX"}
        };
        
        return k[0][num/1000] + k[1][num%1000/100] + k[2][num%100/10] + k[3][num%10];
        
    }
}
