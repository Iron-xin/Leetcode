package _309最佳买卖股票时机含冷冻期;

public class Solution {
    public int maxProfit(int[] prices) {
        int len;
        if (prices == null || (len = prices.length) == 0)
            return 0;
        int[][] dp = new int[len][3];
//        0.不持股且当天没卖出,定义其最大收益dp[i][0];
//        1.持股,定义其最大收益dp[i][1]；
//        2.不持股且当天卖出了，定义其最大收益dp[i][2]；
        dp[0][0] = 0; //其实这种情况才是冷冻期的一种情况
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < len; i++) {
            //不持股，所以就看昨天也不持股和昨天卖了之后的就不持股的结果
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            //持有股票时，那就看昨天的持股收益，或者是昨天没持股的时候，今天买了股票就持有了
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            // 今天把股票给卖了，就是昨天的持股收益加今天的卖出
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][2]);
    }
}