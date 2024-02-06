class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int sum = 0, ans = 0;
        for(int i : nums)
        {
            sum += i;
            if(m.containsKey(sum-k))
                ans += m.get(sum-k);
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        System.out.println(m);
        return ans;
    }
}