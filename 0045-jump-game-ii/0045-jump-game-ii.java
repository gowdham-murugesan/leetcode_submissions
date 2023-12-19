class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int j = 1, max = nums[0], s = nums[0];
        for(int i=1; i<nums.length-1; i++)
        {
            max = Math.max(nums[i]+i, max);
            s--;
            if(s==0)
            {
                s = max-i;
                j++;
            }
        }
        return j;
    }
}