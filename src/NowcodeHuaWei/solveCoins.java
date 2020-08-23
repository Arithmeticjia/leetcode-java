package NowcodeHuaWei;

public class solveCoins {

    public int solve (int n, int[] a1, int[] a2, int[] a3, int[] m){

        int[][] dp = new int[3][n];
        dp[0][0] = a1[0];
        dp[1][0] = a2[0];
        dp[2][0] = a3[0];

        for(int i = 1; i < n;i++){

            dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1] - m[i-1]) + a1[i];
            dp[1][i] = Math.max(Math.max(dp[0][i-1] - m[i-1], dp[2][i-1]) - m[i-1], dp[1][i-1]) + a2[i];
            dp[2][i] = Math.max(dp[2][i-1], dp[1][i-1] - m[i-1]) + a3[i];
        }

        return Math.max(Math.max(dp[0][n-1],dp[1][n-1]),dp[2][n-1]);
    }
}
