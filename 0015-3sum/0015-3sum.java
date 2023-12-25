class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i, j, k, sum;
        for(i=0; i<n; i++)
        {
            j = i+1;
            k = n-1;
            while(j<k)
            {
                sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0)
                    k--;
                else
                    j++;
            }
        }
        ans.addAll(set);
        return ans;
    }
}