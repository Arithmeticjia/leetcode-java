package stock;

/**
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 *
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 *
 * 返回获得利润的最大值。
 *
 */
public class maxProfit2 {

    public int maxProfit(int[] prices, int fee) {
        // dp[i][j]最大收益
        // i表示第i天
        // j = 0 表示不持股，j = 1表示持股
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0] - fee;
        for(int i = 1;i < prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][0] - prices[i] - fee, dp[i-1][1]);
        }
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][1]);
    }
}
