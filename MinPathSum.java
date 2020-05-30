Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7

public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
         int m = grid.length;
        int n = grid[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j != 0){
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }else if(i != 0 && j ==0){
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }else if( i == 0 && j == 0){
                    grid[i][j] = grid[i][j];
                }else{
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j-1], grid[i-1][j]);
                }
            }
        }
        
        return grid[m-1][n-1];
    }
