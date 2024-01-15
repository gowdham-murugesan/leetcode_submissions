class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<matches.length; i++)
        {
            Integer t1 = m.put(matches[i][0], 0);
            Integer t2 = m.put(matches[i][1], -1); 
            if(t1!=null && t1<0)
                m.put(matches[i][0], t1);
            if(t2!=null)
                m.put(matches[i][1], t2-1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            if(entry.getValue()>=0)
                ans.get(0).add(entry.getKey());
            else if(entry.getValue()==-1)
                ans.get(1).add(entry.getKey());
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}