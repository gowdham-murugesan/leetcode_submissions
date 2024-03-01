class Solution {
    public String maximumOddBinaryNumber(String s) {
        String ans = "";
        int one = 0, zero = 0;
        for(char c : s.toCharArray())
            if(c=='0')
                zero++;
            else
                one++;
        for(int i=0; i<one; i++)
            ans += '1';
        for(int i=0; i<zero; i++)
            ans += '0';
        return ans.substring(1) + '1';
    }
}