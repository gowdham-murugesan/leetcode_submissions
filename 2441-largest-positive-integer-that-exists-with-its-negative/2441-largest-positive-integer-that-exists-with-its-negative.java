class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int ans = -1;
        for(int i=0; i<nums.length; i++)
        {
            list.add(nums[i]);
            if(list.contains(-nums[i]) && Math.abs(nums[i])>ans)
                ans = Math.abs(nums[i]);
        }
        return ans;
    }
}