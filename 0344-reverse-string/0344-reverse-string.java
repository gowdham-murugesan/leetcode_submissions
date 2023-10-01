class Solution {
    public void reverseString(char[] s) {
        int st = 0, e = s.length-1; 
        char t;
        while(st<e)
        {
            t = s[st];
            s[st++] = s[e];
            s[e--] = t;

        }
    }
}