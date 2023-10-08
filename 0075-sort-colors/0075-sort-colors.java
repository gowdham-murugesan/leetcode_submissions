class Solution {
    public void sortColors(int[] nums) {
        int l=0, m=0, n=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                l++;
            else if(nums[i]==1)
                m++;
            else
                n++;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(i<l)
            {
                nums[i] = 0;
            }
            else if(i<l+m)
            {
                nums[i] = 1;
            }
            else
            {
                nums[i] = 2;
            }
        }
    }
}