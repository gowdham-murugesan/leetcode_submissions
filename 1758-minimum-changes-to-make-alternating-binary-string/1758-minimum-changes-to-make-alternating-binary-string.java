class Solution {
    public int minOperations(String s) {
        int min1 = 0, min2 = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(i%2==0 && s.charAt(i)=='0')
                min1++;
            if(i%2==1 && s.charAt(i)=='1')
                min1++;
        }
        for(int i=0; i<s.length(); i++)
        {
            if(i%2==1 && s.charAt(i)=='0')
                min2++;
            if(i%2==0 && s.charAt(i)=='1')
                min2++;
        }
        return Math.min(min1, min2);
    }
}