class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    static void reverse(int nums[], int s, int e)
    {
        int t;
        while(s<e)
        {
            t = nums[s];
            System.out.println(s + " " + e);
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}