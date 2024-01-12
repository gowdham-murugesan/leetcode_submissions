class Solution {
    public boolean halvesAreAlike(String s) {
        int ans = 0, n = s.length()/2, i = 0;
        String v = "aieouAEIOU";
        for(char c : s.toCharArray())
        {
            if(i<n && v.indexOf(c)>=0)
                ans++;
            else if(v.indexOf(c)>=0)
                ans--;
            i++;
        }
        return ans==0;
    }
}