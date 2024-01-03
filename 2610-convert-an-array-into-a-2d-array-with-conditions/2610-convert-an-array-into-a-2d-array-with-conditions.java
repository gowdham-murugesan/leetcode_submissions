class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int freq[] = new int[nums.length+1];
        for(int i : nums)
        {
            freq[i]++;
            if(freq[i]>ans.size())
            {
                ans.add(new ArrayList<>());
            }
            ans.get(freq[i]-1).add(i);
        }
        return ans;
    }
}