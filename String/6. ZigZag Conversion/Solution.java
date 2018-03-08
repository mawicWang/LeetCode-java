// ZigZag

// PAYPALISHIRING,3

// P   A   H   N
// A P L S I I G
// Y   I   R

// PAYPALISHIRING,4

// P     I     N
// A   L S   I G
// Y A   H R
// P     I

// PAYPALISHIRING,5

// P       H
// A     S I
// Y   I   R
// P L     I G
// A       N


// 01234…,N

//  0              N+(N-2)
//  1   N+(N-2)-1  1+N+(N-2)
//  2   N+(N-2)-2  2+N+(N-2)
//  .   .            .
//  .   .            .
// N-3  N+1        N-3+N+(N-2)
// N-2  N          N-2+N+(N-2)
// N-1             N-1+N+(N-2)


//  0                            0+2N-2
//  1   2N-3 = (2N-2)-1          1+2N-2
//  2   2N-4 = (2N-2)-2          2+2N-2
//  .   .                            .
//  .   .                            .
// N-3  N+1 = (2N-2)-(N-3)       N-3+2N-2
// N-2  N   = (2N-2)-(N-2)       N-2+2N-2
// N-1                           N-1+2N-2
class Solution {
    public String convert(String s, int numRows) {
        if(numRows >= s.length() || numRows == 1){
            return s;
        }
        
        StringBuffer res = new StringBuffer();
        int gap = numRows * 2 - 2;
        for(int i = 0; i < numRows; i++) {
            if(i == 0 || i == numRows - 1){
                int j = i;
                while(j < s.length()) {
                    res.append(s.charAt(j));
                    j += gap;
                }
            } else {
                int p = i;
                int q = gap - i;
                while(q < s.length()) {
                    res.append(s.charAt(p));
                    res.append(s.charAt(q));   
                    p += gap;
                    q += gap;
                }
                if(p < s.length()){
                    res.append(s.charAt(p));
                }
            }
        }
        
        return res.toString();
    }
}
