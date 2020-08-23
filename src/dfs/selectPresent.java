package dfs;

/**
 * 收到礼物最小体积和
 * 动态规划
 */
public class selectPresent {

    public int selectPresent (int[][] presentVolumn) {

        if(presentVolumn == null || presentVolumn.length == 0 || presentVolumn[0].length == 0){
            return 0;
        }

        int n = presentVolumn.length;
        int m = presentVolumn[0].length;

        int[][] dp = presentVolumn;

        for(int i = 1; i < n;i++){
            dp[i][0] += dp[i-1][0];
        }

        for(int i = 1; i < m;i++){
            dp[0][i] += dp[0][i-1];
        }

        for(int i = 1;i < n;i++){
            for(int j = 1; j < m;j++){
                dp[i][j] += Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
            }
        }

        return dp[n-1][m-1];

    }
}
