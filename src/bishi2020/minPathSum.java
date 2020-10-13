package bishi2020;

/**
 * 给定一个 n * m 的矩阵 a，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和.
 * 输出所有的路径中最小的路径和。
 */
public class minPathSum {

    public int minPathSum (int[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];

        for(int i = 1; i < n;i++){
            dp[0][i] = dp[0][i-1] + matrix[0][i];
        }

        for(int i = 1; i < m;i++){
            dp[i][0] += dp[i-1][0] + matrix[i][0];
        }

        for(int i = 1; i < m;i++){
            for(int j = 1; j < n;j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
            }
        }

        return dp[m-1][n-1];
    }
}
