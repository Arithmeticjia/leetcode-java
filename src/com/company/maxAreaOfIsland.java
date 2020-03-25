package com.company;

public class maxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        if(m == 0 || grid == null){
            return 0;
        }
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                maxArea = Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid,int i,int j){
        // 判断如果不是岛屿，则直接返回0
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        // 每次找到岛屿，则直接把找到的岛屿改成0
        grid[i][j] = 0;
        int area = 1;
        area += dfs(grid,i + 1, j);
        area += dfs(grid,i - 1, j);
        area += dfs(grid,i, j + 1);
        area += dfs(grid,i, j - 1);

        return area;
    }
}
