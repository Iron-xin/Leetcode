package _122买卖股票的最佳时机II;

public class Solution2 {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // 0：持有现金
        // 1：持有股票
        // 状态转移：0 → 1 → 0 → 1 → 0 → 1 → 0
        int[][] dp = new int[len][2];

        dp[0][0] = 0;//某天没有股票
        dp[0][1] = -prices[0];//某天持有股票，这只是初始条件

        for (int i = 1; i < len; i++) {
            // 某天没有，所以要么和昨天一样都没有股票，要么是昨天买了今天卖
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            //某天持有，要么昨天也持有，要么昨天没有持股，今天持股，所以利润要减今天的成本
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[len - 1][0];
    }
}