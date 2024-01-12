class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long ans = 0;
        for(int i=0; i<k; i++)
            ans += nums[i];
        long max = ans;
        for(int i=k; i<nums.length; i++)
        {
            ans += nums[i]-nums[i-k];
            max = Math.max(max, ans);
        }
        return max/(float)k;
    }
}