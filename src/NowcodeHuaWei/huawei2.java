package NowcodeHuaWei;

import java.util.Arrays;

/**
 * 输入矩阵的行和列，接下来输入字符矩阵，H代表陆地，S代表水池，被H或者边界包围的S算成有一个水池，让你计算有多少个水池
 * DFS
 * 我们可以将二维网格看成一个无向图，竖直或水平相邻的 11 之间有边相连。
 * 为了求出岛屿的数量，我们可以扫描整个二维网格。如果一个位置为 11，则以其为起始节点开始进行深度优先搜索。在深度优先搜索的过程中，每个搜索到的 11 都会被重新标记为 00。
 *
 * 最终岛屿的数量就是我们进行深度优先搜索的次数。
 *
 */
public class huawei2 {

    public static void main(String[] args) {
        char[][] b = {
                {'S','S','H','H','H'},
                {'S','S','H','H','H'},
                {'H','H','S','H','H'},
                {'H','H','H','S','S'},
        };
        //输出3
        System.out.print(new huawei2().huawei2(b));
    }

    public int huawei2(char[][] grid) {
        int count = 0;
        for(int i = 0;i < grid.length;i++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 'S'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid,int i,int j){
        //遇见岛屿就返回
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 'H'){
            return;
        }else{
            grid[i][j] = 'H';
        }
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
    }
}


