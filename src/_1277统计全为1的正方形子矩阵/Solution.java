package _1277统计全为1的正方形子矩阵;

public class Solution {
    public int countSquares(int[][] matrix) {
        int result = 0;
        int m = matrix.length;//行
        int n = matrix[0].length;//列
        int dp[][] = new int[m][n];
        for(int i = 0 ; i<m;i++){
            for(int j = 0 ; j < n;j ++){
                if(i == 0 || j == 0){
                    dp[i][j] = matrix[i][j];
                }else if(matrix[i][j] == 1){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
                result +=dp[i][j];
            }
        }
        return result;
    }
}