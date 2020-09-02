package 剑指offer._49丑数;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int l2 = 0, l3 = 0, l5 = 0;
        for(int i = 1; i < n; ++i) {
            dp[i] = Math.min(Math.min(dp[l2] * 2, dp[l3] * 3), dp[l5] * 5);
            //如果某个丑数乘2是当前的结果，那么下一个乘以2的丑数肯定不是这个指针指的了，所以
            //要指向下一个丑数即指针++,下一个丑数乘以2有可能是下一次的结果
            //同理3,5也是这样，最终我们每次比较的都是3个丑数，而这三个分别乘2,3,5进行比较
            if (dp[i] == dp[l2] * 2) {
                ++l2;
            }
            if (dp[i] == dp[l3] * 3) {
                ++l3;
            }
            if (dp[i] == dp[l5] * 5) {
                ++l5;
            }
        }
        return dp[n - 1];
    }
}