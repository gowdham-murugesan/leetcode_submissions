class Solution {
    public int minimumLength(String s) {
        int i=0, j=s.length()-1, ans = s.length();
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return ans;
            char a = s.charAt(i);
            while(s.charAt(i)==a && i<j)
            {
                i++;
                ans--;
            }
            char b = s.charAt(j);
            while(s.charAt(j)==b && i<=j)
            {
                j--;
                ans--;
            }
            System.out.println(a +" "+b);
        }
        return ans;
    }
}