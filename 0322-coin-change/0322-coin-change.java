class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1; i<dp.length; i++)
        {
            for(int j=0; j<coins.length; j++)
            {
                if(i>=coins[j] && dp[i-coins[j]]!=Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
            }
            System.out.print(dp[i] + " ");
        }
        return dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount];
    }
}