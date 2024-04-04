class Solution {
    public int maxDepth(String s) {
        int t = 0, m = 0;
        for(char c : s.toCharArray())
        {
            m = t>m ? t : m;
            if(c=='(')
                t++;
            else if(c==')')
                t--;
        }
        return m;
    }
}