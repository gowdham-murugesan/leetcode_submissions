class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.indexOf(ch);
        char[] str = word.toCharArray();
        char t;
        for(int i=0; i<=n/2 && n>=0; i++)
        {
            t = str[i];
            str[i] = str[n-i];
            str[n-i] = t;
        }
        return String.valueOf(str);
    }
}