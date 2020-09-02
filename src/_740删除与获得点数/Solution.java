package _740删除与获得点数;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int max = nums[0];
        for (int i = 0; i < len; i++)
            if (max < nums[i])
                max = nums[i];max++;
        int[] arr = new int[max];
        int[][] dp = new int[max][2];
        for (int i = 0; i < len; i++) arr[nums[i]]++;
        // 0 获取 1 不获取
        dp[1][0] = arr[1];
        // dp[1][1] = 0;
        for (int i = 2; i < max; i++) {
            // 这两句代码中的其中一个比较是相同的。
            dp[i][0] = Math.max(dp[i-2][0] , dp[i-1][1]) + arr[i] * i;
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[max-1][0], dp[max-1][1]);
    }
}