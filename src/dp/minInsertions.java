package dp;


/**
 * 1312. 让字符串成为回文串的最少插入次数
 */
public class minInsertions {

    public int minInsertions(String s) {
        int[][] dp = buildDP(s.toCharArray());
        return dp[0][s.length() - 1];
    }

    private int[][] buildDP(char[] chars) {

        int n = chars.length;
        // str[i,j]范围内最少添加多少个字符可以形成字符串
        int[][] dp = new int[n][n];
        for (int j = 1; j < n; j++) {
            //只有两个的时候，判断这两个是否相等
            //相等的话就是0，不相等就是1
            dp[j - 1][j] = (chars[j - 1] == chars[j]) ? 0 : 1;
            for (int i = j - 2; i >= 0; i--) {
                if (chars[i] == chars[j]) {
                    // 相等
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp;

    }

}
