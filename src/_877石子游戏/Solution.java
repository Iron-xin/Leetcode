package _877石子游戏;
//用486的填写二维数组的方式吧
public class Solution {
    public boolean stoneGame(int[] piles) {
//dp[i][j]为i开始到j结束alex能赢li多少分 alex先拿的话
        //dp[i][j] = max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1])
        int[][] dp = new int[piles.length][piles.length];
        for(int i = 0; i < piles.length; i++){
            dp[i][i] = piles[i];
        }
        for(int i = 1; i < piles.length; i++){
            for(int j = 0; j < piles.length - i; j++){
                dp[j][j + i] = Math.max(piles[j] - dp[j + 1][j + i], piles[j + i] - dp[j][j + i - 1]);
            }
        }
        return dp[0][piles.length - 1] > 0;
    }
}