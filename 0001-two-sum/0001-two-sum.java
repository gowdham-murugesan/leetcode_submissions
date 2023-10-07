class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int b[] = new int[2];
        for(i=0; i<nums.length-1; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if((nums[i]+nums[j])==target)
                {                                                 
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
        return b;
    }
}