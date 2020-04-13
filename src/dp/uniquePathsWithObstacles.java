package dp;

import java.util.Arrays;

public class uniquePathsWithObstacles {

    public static void main(String[] args){
        uniquePathsWithObstacles test = new uniquePathsWithObstacles();
        int[][] m = { {0,0,0},{0,1,0},{0,0,0}};
        System.out.println(test.uniquePathsWithObstacles(m));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m == 0 || obstacleGrid == null){
            return 0;
        }
        int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++){
            if(obstacleGrid[i][0] != 1){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;
                break;
            }
        }
        for(int i = 0;i < n;i++){
            if(obstacleGrid[0][i] != 1){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
