package _63不同路径II;

public class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] dp = new int[rows][cols];

        for (int i = 0; i < cols; i++)
            if (arr[0][i] == 1) {
                dp[0][i] = 0;
                break;   // 遇到障碍后面的都无法到达直接返回就行 默认就是0
            }
            else dp[0][i] = 1;

        for (int i = 0; i < rows; i++)
            if (arr[i][0] == 1) {
                dp[i][0] = 0;
                break;  // 遇到障碍后面的都无法到达直接返回就行 默认就是0
            }
            else dp[i][0] = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (arr[i][j] == 1)
                    dp[i][j] = 0; // 遇到障碍就是0
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // dpdpdp
            }
        }
        return dp[rows - 1][cols - 1];
    }
}