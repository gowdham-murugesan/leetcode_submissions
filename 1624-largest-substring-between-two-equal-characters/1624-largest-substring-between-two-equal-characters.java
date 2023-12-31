class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        int i, j;
        for(char c : s.toCharArray())
        {
            i = s.indexOf(c);
            j = s.lastIndexOf(c);
            ans = Math.max(ans, j-i-1);
        }
        return ans;
    }
}