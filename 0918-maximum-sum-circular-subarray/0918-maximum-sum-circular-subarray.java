class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0], max = nums[0], min = nums[0], mSum = nums[0], n = nums.length, total = nums[0];
        for(int i=1; i<n; i++)
        {
            sum = Math.max(sum+nums[i], nums[i]);
            max = Math.max(max, sum);
            mSum = Math.min(mSum+nums[i], nums[i]);
            min = Math.min(mSum, min);
            total += nums[i];
        }
        return max>0 ? Math.max(max, total - min) : max;
    }
}