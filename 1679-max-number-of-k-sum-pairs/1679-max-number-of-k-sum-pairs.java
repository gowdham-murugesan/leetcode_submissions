class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, s = 0, e = nums.length-1;
        while(s<e)
        {
            int t = nums[s]+nums[e];
            if(t==k)
            {
                ans++;
                s++;
                e--;
            }
            else if(t>k)
                e--;
            else
                s++;
        }
        return ans;
    }
}