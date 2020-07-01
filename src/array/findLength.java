package array;


/**
 * 718. 最长重复子数组
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 */
public class findLength {

    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int n = A.length, m = B.length;
        int[][] dp = new int[n+1][m+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                // dp[i][j] 表示 A[i:] 和 B[j:] 的最长公共前缀
                dp[i][j] = A[i-1] == B[j-1] ? dp[i-1][j-1] + 1:0;
                ans = Math.max(ans,dp[i][j]);
            }
        }

        return ans;
    }
}
