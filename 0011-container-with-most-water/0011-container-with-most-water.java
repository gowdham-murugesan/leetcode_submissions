class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max = 0;
        while(l<=r)
        {
            max = Math.max(max, Math.min(height[r], height[l])*(r-l));
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}