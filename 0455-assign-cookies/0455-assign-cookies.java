class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0, i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length)
        {
            if(g[i]<=s[j])
            {
                ans++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return ans;
    }
}