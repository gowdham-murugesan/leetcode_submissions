class Solution {
    public String makeGood(String s) {
        String ans = "";
        int len = 0, prev = -1;
        while(prev!=len)
        {
            ans = "";
            for(int i=0; i<s.length(); i++)
            {
                if(i<s.length()-1 && (s.charAt(i)-32==s.charAt(i+1) || s.charAt(i)+32==s.charAt(i+1)))
                {
                    i++;
                    continue;
                }
                ans += s.charAt(i);
            }
            prev = len;
            len = ans.length();
            s = ans;
        }
        return ans;
    }
}