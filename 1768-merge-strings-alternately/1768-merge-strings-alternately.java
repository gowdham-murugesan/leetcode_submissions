class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int a = word1.length(), b = word2.length(), i = 0;
        for(i=0; i<Math.min(a, b); i++)
            ans += word1.charAt(i) + "" + word2.charAt(i);
        if(a>b)
            ans += word1.substring(i);
        else
            ans += word2.substring(i);
        return ans;
    }
}