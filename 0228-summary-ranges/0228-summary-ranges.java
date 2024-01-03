class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            int j = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            if(j!=nums[i])
                ans.add(j+"->"+nums[i]);
            else
                ans.add(j+"");
        }
        return ans;
    }
}