class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = 0, y = s.length(), i;
        for(i = 0; i<t.length(); i++)
        {
            if(x<y && t.charAt(i)==s.charAt(x))
                x++;
        }
        return x==s.length();
    }
}