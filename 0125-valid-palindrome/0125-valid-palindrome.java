class Solution {
    public boolean isPalindrome(String s) {
        String a = "";
        for(char c : s.toCharArray())
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
                a += c;
        int n = a.length();
        a = a.toLowerCase();
        for(int i=0; i<n/2; i++)
            if(a.charAt(i)!=a.charAt(n-i-1))
                return false;
        return true;
    }
}