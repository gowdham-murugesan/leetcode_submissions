class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return max;
    }
    void dfs(List<String> arr, int i, String s)
    {
        if(unique(s))
            max = Math.max(max, s.length());
        if(!unique(s) || i==arr.size())
            return;
        for(int j=i; j<arr.size(); j++)
            dfs(arr, j+1, s+arr.get(j));
    }
    boolean unique(String s)
    {
        int arr[] = new int[26];
        for(char c : s.toCharArray())
            if(arr[c-'a']++ > 0)
                return false;
        return true;
    }
}