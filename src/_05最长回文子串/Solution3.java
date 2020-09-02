package _05最长回文子串;

public class Solution3 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        boolean[][] dp = new boolean[len][len];//二维数组，一个表示左边界，一个表示右边界
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;//左右边界相等，自然是true。
        }

        int maxLen = 1;//整体的最大串
        int start = 0;//整体的左边界

        for (int j = 1; j < len; j++) {//j是右边界，所以每次+1
            for (int i = j - 1; i >= 0; i--) {//i是左边界，所以每次-1
                if (s.charAt(i) == s.charAt(j)) {//这里是相等的情况，没太看懂
                    if (j - i < 3) {//如果左右边界相差不大于2，说明是aba、cc这种，因为b必然是是true，所以左右相等的aba也true
                        dp[i][j] = true;
                    } else {//相差太大，则必须考虑其子字符串，也就是说，如果自字符串也是的话，那么外面再加一层i和j相等时
                        // 也是回文的字符串，所以，父字符串的状态和子字符串的状态相同
                        //这里也是相等时，不能直接为true的原因，父和子有关。比如abcda，最外面的a相同，但是字符串并不是回文。
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {//不相等肯定false
                    dp[i][j] = false;
                }

                if (dp[i][j]) {//如果相等，就需要记录下或者说更新下全局变量
                    int curLen = j - i + 1;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}