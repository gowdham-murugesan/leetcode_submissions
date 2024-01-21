class Solution {
    public int rob(int[] nums) {
        int rob = 0, not = 0, curr;
        for(int i : nums)
        {
            curr = not + i;
            not = Math.max(rob, not);
            rob = curr;
        }
        return Math.max(rob, not);
    }
}