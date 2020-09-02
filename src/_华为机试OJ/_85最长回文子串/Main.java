package _华为机试OJ._85最长回文子串;

import java.util.Scanner;
public class Main {

    public static int maxLongHuiwen(String str) {
        //等价于求str字符串的逆序字符串和str的最长公共子串，动态
        String strrev = new StringBuilder(str).reverse().toString();
        int len = str.length();
        int[][] dp = new int[len + 1][len + 1];
        int max = 0; //记录最长公共子串的长度
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (str.charAt(i - 1) == strrev.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(maxLongHuiwen(str));
        }
        in.close();
    }
}