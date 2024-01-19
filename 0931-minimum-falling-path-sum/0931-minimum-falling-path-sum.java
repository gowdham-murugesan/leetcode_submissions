class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        for(int i=1; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(j==0)
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                else if(j==c-1)
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j-1]);
                else
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i : matrix[r-1])
            min = Math.min(min, i);
        return min;
    }
}