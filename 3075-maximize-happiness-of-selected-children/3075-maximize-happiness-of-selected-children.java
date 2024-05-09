class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int j = 0, n = happiness.length;
        for(int i=n-1; i>=n-k; i--)
        {
            happiness[i] = Math.max(happiness[i]-j++, 0);
            res += happiness[i];
        }
        return res;
    }
}