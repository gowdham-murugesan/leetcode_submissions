class Solution {
    public int findDuplicate(int[] nums) {
        for(int i : nums)
        {
            int id = Math.abs(i);
            if(nums[id]<0)
                return id;
            nums[id] = -nums[id];
        }
        return 0;
    }
}