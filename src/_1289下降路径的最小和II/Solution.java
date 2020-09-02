package _1289下降路径的最小和II;

import java.util.Arrays;

public class Solution {
    public int minFallingPathSum(int[][] arr) {
        int len = arr.length;
        // int len2 = arr[0].length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[0][i] = arr[0][i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[i][j]=Integer.MAX_VALUE;
                //每行和每列，至少两层，然后在遍历到ij时，又要比较上一行的最小值，且不包含本列的
                for (int k = 0; k < len; k++) {
                    if (j != k) {
                        dp[i][j] = Math.min(dp[i-1][k]+arr[i][j], dp[i][j]);
                    }
                }
                //在遍历到最后一行时，更新操作
                if (i == len-1)
                    min = Math.min(min, dp[i][j]);
            }
        }
        return min;
    }
}
