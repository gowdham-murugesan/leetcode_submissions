public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int ans = 0;
        for(char c : a.toCharArray())
            if(c=='1')
                ans++;
        return ans;
    }
}