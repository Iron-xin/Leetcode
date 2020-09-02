package _931下降路径的最小和;

public class Solution {
    public int minFallingPathSum(int[][] A) {
        int n = A.length;
        if(n == 1){
            return A[0][0];
        }
        int[][] dp = new int[n+1][n+2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j + 1]) + A[i][j];
                }
                else if(j == n - 1){
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - 1]) + A[i][j];
                }
                else{
                    dp[i + 1][j] = Math.min(Math.min(dp[i][j], dp[i][j - 1]), dp[i][j + 1]) + A[i][j];
                }

            }
        }
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(result > dp[n][i]){
                result = dp[n][i];
            }
        }
        return result;
    }
}