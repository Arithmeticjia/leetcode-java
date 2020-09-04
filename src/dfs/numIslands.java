package dfs;


/**
 * 200 岛屿数量
 * 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 */
public class numIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        //超过边界或者判断是水域
        //直接结束
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }else {
            //重新置位
            grid[i][j] = '0';
        }
        //右
        dfs(grid,i,j+1);
        //左
        dfs(grid,i,j-1);
        //上
        dfs(grid,i-1,j);
        //下
        dfs(grid,i+1,j);
    }
}
