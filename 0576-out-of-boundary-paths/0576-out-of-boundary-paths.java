class Solution {
    Long dp[][][] = null;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Long[m+1][n+1][maxMove+1];
        return (int)path(m, n, maxMove, startRow, startColumn);
    }
    long path(int m, int n, int M, int i, int j)
    {
        if(M<0)
            return 0;
        if(i<0 || j<0 || i==m || j==n)
            return 1;
        if(dp[i][j][M]!=null)
            return dp[i][j][M];
        long t = path(m, n, M-1, i-1, j);
        long b = path(m, n, M-1, i+1, j);
        long l = path(m, n, M-1, i, j-1);
        long r = path(m, n, M-1, i, j+1);

        dp[i][j][M] = (t+b+l+r) % 1000000007;
        return dp[i][j][M];
    }
}