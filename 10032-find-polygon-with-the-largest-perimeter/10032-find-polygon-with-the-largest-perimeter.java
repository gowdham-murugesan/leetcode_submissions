class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = n, check, peri = 0;
        for(int i=0; i<n; i++)
                peri += nums[i];
        for(int i=n-1; i>=0; i--)
        {
            check = peri - nums[i];
            if(check<=nums[i])
            {
                peri -= nums[i];
                count--;
            }
        }
        return count >= 3 ? peri : -1;
    }
}