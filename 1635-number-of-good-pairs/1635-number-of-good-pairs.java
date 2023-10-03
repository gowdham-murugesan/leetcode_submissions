class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i, j, count=0, n=nums.length;
        for(i=0; i<n-1; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(nums[i]==nums[j])
                {
                    count+=1;
                }
            }
        }
        return count;
    }
}