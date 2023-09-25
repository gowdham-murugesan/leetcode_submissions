class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> ans = new HashMap<>();
        String res[] = new String[names.length];
        for(int i=0; i<names.length; i++)
        {
            ans.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i=0; i<names.length; i++)
        {
            res[i] = ans.get(heights[names.length-i-1]);
        }
        return res;
    }
}