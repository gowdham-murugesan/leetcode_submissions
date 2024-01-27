class Solution {
    Integer memo[][] = new Integer[1001][1001];
    public int kInversePairs(int n, int k) {
        if(n==0)
            return 0;
        if(k==0)
            return 1;
        if(memo[n][k]!=null)
            return memo[n][k];
        int ans = 0;
        for(int i=0; i<=Math.min(n-1, k); i++)
        {
            ans = (ans + kInversePairs(n-1, k-i)) % 1000000007;
        }
        memo[n][k] = ans;
        return ans;
    }
}