class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length<=2)
            return nums;
        int xor = 0, setb = 0;
        for(int i : nums)
            xor ^= i;
        setb = xor & (-xor);
        int ans[] = new int[2];
        for(int i : nums)
        {
            if((i&setb)==0)
                ans[0] ^= i;
            else
                ans[1] ^= i;
        }
        return ans;
    }
}