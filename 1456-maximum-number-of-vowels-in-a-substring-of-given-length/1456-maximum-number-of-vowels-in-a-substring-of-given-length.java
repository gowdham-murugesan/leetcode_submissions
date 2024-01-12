class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        String v = "aeiouAEIOU";
        for(int i=0; i<k; i++)
            if(v.indexOf(s.charAt(i))!=-1)
                c++;
        int max = c;
        for(int i = k; i<s.length(); i++)
        {
            if(v.indexOf(s.charAt(i))!=-1)
                c++;
            if(v.indexOf(s.charAt(i-k))!=-1)
                c--;
            max = Math.max(max, c);
        }
        return max;
    }
}