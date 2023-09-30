class Solution {
    public static int toInd(char a) {
        return (a - 'A' + 1);
    }

    public int titleToNumber(String c) {
        int n = c.length();
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            ans *= 26;
            ans += toInd(c.charAt(i));
        }
        return ans;
    }
}