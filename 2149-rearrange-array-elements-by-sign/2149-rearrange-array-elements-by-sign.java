class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        for(int i=0, j=0, k=0; i<n; i++)
        {
            if(nums[i]>0)
                pos[j++] = nums[i];
            else
                neg[k++] = nums[i];
        }
        for(int i=0, j=0; i<n; i++)
        {
            nums[i++] = pos[j];
            nums[i] = neg[j++];
        }
        return nums;
    }
}