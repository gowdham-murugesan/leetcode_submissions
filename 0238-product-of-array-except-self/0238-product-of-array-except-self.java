class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, post = 1;
        int[] pre = new int[n];
        pre[0] = 1;
        for(int i=1; i<n; i++)
            pre[i] = pre[i-1] * nums[i-1];
        for(int i=n-1; i>=0; i--)
        {
            int t = nums[i];
            nums[i] = pre[i] * post;
            post *= t;
        }
        return nums;
    }
}