class Solution {
    public boolean increasingTriplet(int[] nums) {
        int s = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(num <= s)
                s = num;
            else if(num <= b)
                b = num;
            else
                return true;
        }
        return false;
    }
}