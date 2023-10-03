class Solution {
    public int longestConsecutive(int[] nums) {
        int c = 1, l = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
            set.add(n);
        for(int i : set)
        {
            if(!set.contains(i-1))
            {
                c = 1;
                while(set.contains(i+1))
                {
                    c++;
                    i++;
                }
                l = c>l ? c : l;
            }
        }
        return l;
    }
}