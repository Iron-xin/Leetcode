package _322零钱兑换;

import java.util.Arrays;
//dp[i] ：凑齐总价值 i 需要的最少硬币数，状态就是问的问题。
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i]=amount + 1;//初始条件赋值，你永远也取不到的，因此后边的return里也是这个判断，如果你没改变，说明是-1
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}