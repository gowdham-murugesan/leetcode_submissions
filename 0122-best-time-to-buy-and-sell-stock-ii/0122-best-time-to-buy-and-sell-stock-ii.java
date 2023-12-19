class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        for(int i=1; i<prices.length; i++)
        {
            p = (prices[i]-prices[i-1])>0 ? p+prices[i]-prices[i-1] : p;
        }
        return p;
    }
}