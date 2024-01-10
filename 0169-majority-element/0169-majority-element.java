class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val+1);
        }
        for(Map.Entry<Integer, Integer> ent : map.entrySet())
        {
            if(ent.getValue()>n/2)
                return ent.getKey();
        }
        return 0;
    }
}