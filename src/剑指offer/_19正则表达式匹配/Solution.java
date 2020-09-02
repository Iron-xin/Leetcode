package 剑指offer._19正则表达式匹配;

public class Solution {
    public boolean isMatch(String s, String p) {
        int ns = s.length() + 1;
        int np = p.length() + 1;
        boolean[][] dp = new boolean[ns][np];
        dp[0][0] = true;
        for (int i = 1; i < np; i++) {
            if (((i - 1) & 1) == 1) {
                if (p.charAt(i - 1) != '*') {
                    break;
                }
                dp[0][i] = true;
            }
        }
        for (int i = 1; i < ns; i++) {
            for (int j = 1; j < np; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                if (p.charAt(j - 1) == '*') {
                    if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
                    }
                }
            }
        }
        return dp[ns - 1][np - 1];
    }
}
