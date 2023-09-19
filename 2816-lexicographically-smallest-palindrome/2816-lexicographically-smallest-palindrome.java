class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        char st, e;
        StringBuilder ans = new StringBuilder(s);
        for(int i=0; i<n/2; i++)
        {
            st = s.charAt(i);
            e = s.charAt(n-i-1);
            if(st!=e)
            {
                if(st<e)
                    ans.setCharAt(n-i-1, st);
                else
                    ans.setCharAt(i, e);
            }
        }
        return ans.toString();
    }
}