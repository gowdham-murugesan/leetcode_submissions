class Solution {
    public int missingNumber(int[] nums) {
        int x1=0, x2=0, n=nums.length;
        for(int i=0; i<n; i++)
        {
            x1 ^= nums[i];
            x2 ^= i;
        }
        x2 ^= n;
        return x1^x2;
    }
}