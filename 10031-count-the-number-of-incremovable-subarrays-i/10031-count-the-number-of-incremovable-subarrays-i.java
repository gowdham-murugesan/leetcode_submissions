class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int i = 0, j = 0, count = 0;
        int n = nums.length;
        boolean flag;
        for(i=0; i<n; i++)
        {
            for(j=i; j<n; j++)
            {
                flag = true;
                for(int k=1; k<n; k++)
                {
                    if(k>=i && k<=j)
                        continue;
                    if(k-1==j && i>0 && nums[k] > nums[i-1])
                        continue;
                    if(k-1==j && i>0 && nums[k] <= nums[i-1])
                        flag = false;
                    else if(k-1==j && i==0)
                        continue;
                    else if(nums[k] <= nums[k-1])
                        flag = false;
                }
                if(flag)
                {
                    count++;
                }
            }
        }
        return count;
    }
}