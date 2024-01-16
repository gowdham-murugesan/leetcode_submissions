class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums1)
            s1.add(i);
        for(int i : nums2)
            s2.add(i);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(int i : nums1)
            if(s2.add(i))
                ans.get(0).add(i);
        for(int i : nums2)
            if(s1.add(i))
                ans.get(1).add(i);
        return ans;
    }
}