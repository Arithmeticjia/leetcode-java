package com.company;

/*
 岛屿的个数
 */


public class numIslands {

    public static void main(String[] args){

        numIslands test = new numIslands();
        char[][] islands = {{'1','0','0'},{'0','1','0'},{'0','0','0'}};
        System.out.print(test.numIslands(islands));
    }

    public int numIslands(char[][] grid){
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void dfs(char [][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }else {
            grid[i][j] = '0';
        }
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
    }
}
