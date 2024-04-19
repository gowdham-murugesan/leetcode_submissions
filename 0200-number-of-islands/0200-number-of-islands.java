class Solution {
    public static void bfs(char grid[][], int i, int j, int r, int c)
    {
        if(grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        if(i<r-1)
            bfs(grid, i+1, j, r, c);
        if(j<c-1)
            bfs(grid, i, j+1, r, c);
        if(i>0)
            bfs(grid, i-1, j, r, c);
        if(j>0)
            bfs(grid, i, j-1, r, c);
    }
    public int numIslands(char[][] grid) {
        int ans = 0, r = grid.length, c = grid[0].length;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(grid[i][j]=='1')
                {
                    ans++;
                    bfs(grid, i, j, r, c);
                }
            }
        }
        return ans;
    }
}