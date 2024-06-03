class Solution {
    public int appendCharacters(String s, String t) {
        int a = s.length(), b = t.length(), i = 0, j = 0;
        while(i<a && j<b)
        {
            if(s.charAt(i++)==t.charAt(j))
                j++;
        }
        return b-j;
    }
}