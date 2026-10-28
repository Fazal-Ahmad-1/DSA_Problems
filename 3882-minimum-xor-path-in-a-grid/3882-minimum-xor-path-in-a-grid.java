class Solution {
    int dp[][][];
    public int solve(int[][] grid, int i, int j, int xor,int m,int n) {
    xor ^= grid[i][j];

    // Reached the destination
    if (i == m - 1 && j == n - 1) {
        return xor;
    }
    if(dp[i][j][xor]!=-1)
    return dp[i][j][xor];
    int right = Integer.MAX_VALUE;
    int down = Integer.MAX_VALUE;

    // Move right
    if (j + 1 < n) {
        right = solve(grid, i, j + 1, xor,m,n);
    }

    // Move down
    if (i + 1 < m) {
        down = solve(grid, i + 1, j, xor,m,n);
    }

    return dp[i][j][xor]=Math.min(right, down);
}
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        dp = new int[m][n][1025];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        for(int k=0;k<1025;k++)
        dp[i][j][k]=-1;
        return solve(grid,0,0,0,m,n); 
    }
}