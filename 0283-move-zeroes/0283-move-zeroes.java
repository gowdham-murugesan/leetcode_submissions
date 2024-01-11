class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0, j=0, temp=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                temp = nums[i];
                nums[i] = 0;
                nums[j++] = temp;
            }
        }
    }
}