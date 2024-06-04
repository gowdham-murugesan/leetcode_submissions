class Solution {
    public int longestPalindrome(String s) {
        Set<Character> ans = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray())
        {
            if(!ans.add(c))
            {
                ans.remove(c);
                count += 2;
            }
        }
        if(ans.isEmpty())
            return count;
        return count + 1;
    }
}