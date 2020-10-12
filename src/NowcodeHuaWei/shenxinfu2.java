package NowcodeHuaWei;


/**
 * 编辑距离
 */
public class shenxinfu2 {

    public int minDistance (String a, String b) {
        // write code here
        int n = a.length();
        int m = b.length();

        if(n*m == 0){
            return n+m;
        }

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i < n+1;i++){
            dp[i][0] = i;
        }

        for(int j = 0; j < m+1;j++){
            dp[0][j] = j;
        }

        for(int i = 1;i < n+1;i++){
            for(int j = 1;j < m+1;j++){
                int left = dp[i-1][j] + 1;
                int down = dp[i][j-1] + 1;
                int left_down = dp[i-1][j-1];
                if(a.charAt(i-1)!=b.charAt(j-1)){
                    left_down += 1;
                }

                dp[i][j] = Math.min(left,Math.min(down,left_down));
            }
        }

        return dp[n][m];
    }
}
