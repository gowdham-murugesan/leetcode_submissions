class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length, i=0, j=1;
        if(n==1)
            return nums[0];
        Arrays.sort(nums);
        while(i<n && j<n)
        {
            if(nums[i]!=nums[j])
            {
                return nums[i];
            }
            i+=2;
            j+=2;
        }
        return nums[i];
    }
}