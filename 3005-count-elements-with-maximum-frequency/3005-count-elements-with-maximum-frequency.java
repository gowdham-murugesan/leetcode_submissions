class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            arr[nums[i]]++;
            max = Math.max(max, arr[nums[i]]);
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(arr[nums[i]]==max)
            {
                ans++;
            }
        }
        return ans;
    }
}