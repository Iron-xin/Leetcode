package _1143最长公共子序列;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() == 0 || text2.length() == 0)
            return 0;
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];//这样的赋值和下面的遍历形式，可以不赋初值，且不用考虑边界的情况
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}