package _712两个字符串的最小ASCII删除和;

public class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i <= s2.length(); i++) {
            dp[0][i] = s2.charAt(i-1)+dp[0][i-1];
        }
        for (int j = 1; j <= s1.length(); j++) {
            dp[j][0] = s1.charAt(j-1)+dp[j-1][0];
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
//                    dp[i][j] = Math.min(Math.min(
//                            dp[i-1][j]+s1.charAt(i-1),
//                            dp[i-1][j-1]+s1.charAt(i-1)+s2.charAt(j-1)),
//                            dp[i][j-1]+s2.charAt(j-1));
                    //实际上只比较这两个就行
                    dp[i][j] = Math.min(
                            dp[i-1][j]+s1.charAt(i-1),
                            dp[i][j-1]+s2.charAt(j-1));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}