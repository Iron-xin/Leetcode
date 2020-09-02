package _714买卖股票的最佳时机含手续费;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length<2)return 0;
        int[][] dp=new int[prices.length][2];
        dp[0][0]=0;//表示卖出后的结果
        dp[0][1]=-prices[0];//第二位的1表示买入
        for(int i=1;i<prices.length;i++){
            //表示第i天卖出的，要么卖了有收益，要么不卖就是i-1的情况
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]-fee);
            //表示第i天要买了，要么不买，成本和i-1一样，要么买了
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}