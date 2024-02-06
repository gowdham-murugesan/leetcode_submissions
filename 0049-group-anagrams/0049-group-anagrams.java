class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String s : strs)
        {
            char sc[] = s.toCharArray();
            Arrays.sort(sc);
            String so = String.valueOf(sc);
            if(!m.containsKey(so))
                m.put(so, new ArrayList<>());
            m.get(so).add(s);
        }
        return new ArrayList<>(m.values());
    }
}