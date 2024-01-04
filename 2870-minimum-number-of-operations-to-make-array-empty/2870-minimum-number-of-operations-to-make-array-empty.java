class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int t : map.values())
        {
            if(t==1)
                return -1;
            ans += t/3;
            if(t%3!=0)
                ans++;
        }
        return ans;
    }
}