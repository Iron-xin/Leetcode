package _10正则表达式匹配;

public class Solution2 {
    public boolean isMatch(String s, String p) {
        int ns = s.length() + 1;
        int np = p.length() + 1;
        boolean[][] dp = new boolean[ns][np];//防止越界
        dp[0][0] = true;//设置为true的就是匹配成功
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
                //出现了.或者普通相等，就是直接和子问题相同，求子问题的情况
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                //出现了*，而递归的写法一样，都是两大类情况
                if (p.charAt(j - 1) == '*') {
                    if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];//出现0次
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];//出现多次，只出现1次，没有出现
                    }
                }
            }
        }
        return dp[ns - 1][np - 1];
    }
}

