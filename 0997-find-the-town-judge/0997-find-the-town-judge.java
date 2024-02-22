class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans[] = new int[n+1];
        for(int i=0; i<trust.length; i++)
        {
            ans[trust[i][0]]--;
            ans[trust[i][1]]++;
        }
        for(int i=1; i<=n; i++)
            if(ans[i]==n-1)
                return i;
        return -1;
    }
}