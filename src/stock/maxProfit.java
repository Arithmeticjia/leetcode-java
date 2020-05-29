package stock;

/**
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 *
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 *
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 */
public class maxProfit {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        // 特判
        if (len < 2) {
            return 0;
        }
        /**
         * dp[i][j]表示 [0, i] 区间内，到第 i 天（从 0 开始）状态为 j 时的最大收益。
         * j = 0:不持股
         * j = 1:持股
         * j = 2:冷冻期
         */
        int[][] dp = new int[len][3];

        // 初始化
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;

        for (int i = 1; i < len; i++) {
            // 不持股 = 前一天不持股或者前一天持股，今天卖了
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            // 持股 = 前一天持股或者前一天冷冻期，今天买了
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2] - prices[i]);
            // 冷冻期 = 前一天不持股
            dp[i][2] = dp[i - 1][0];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][2]);
    }
}
