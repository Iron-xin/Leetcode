package _72编辑距离;
//假如将i变成j。也就是s1变s2（i指向s1）
//对于整个表来看，应该理解成互相转换。
public class Solution {
    int minDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        // base case
        for (int i = 1; i <= m; i++)
            dp[i][0] = i;
        for (int j = 1; j <= n; j++)
            dp[0][j] = j;
        // 自底向上求解
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (s1.charAt(i-1) == s2.charAt(j-1))//某个位置上相同时，次数不变
                    //原来替换的不用替了，原来删的不用删了，所以是回到i-1和j-1的位置。（同时添加了一个字符）
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    //这里是高度抽象的。不相等的时候，由于都到了下一个位置，所以三种情况都有
                    dp[i][j] = min(
                            dp[i - 1][j] + 1,//删除（因为是i变j，所以i-1就相当于s1减去了一个字符）
                            dp[i][j - 1] + 1,//添加（因为i变j，所以j-1就相当于s2减去一个字符）
                            dp[i-1][j-1] + 1//替换
                    );
        // 储存着整个 s1 和 s2 的最小编辑距离
        return dp[m][n];
    }

    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}
//D[i][j-1] 为 A 的前 i 个字符和 B 的前 j - 1 个字符编辑距离的子问题。即对于 B 的第 j 个字符，我们在 A 的末尾添加了一个相同的字符，
//        那么 D[i][j] 最小可以为 D[i][j-1] + 1；

//D[i-1][j] 为 A 的前 i - 1 个字符和 B 的前 j 个字符编辑距离的子问题。即对于 A 的第 i 个字符，我们在 B 的末尾添加了一个相同的字符，
// 那么 D[i][j] 最小可以为 D[i-1][j] + 1；（如果是A变B,此时就是A删掉第i个字符）（意味着我用i-1个字符就完成的话，i位置就不要了）

//D[i-1][j-1] 为 A 前 i - 1 个字符和 B 的前 j - 1 个字符编辑距离的子问题。
// 即对于 B 的第 j 个字符，我们修改 A 的第 i 个字符使它们相同，那么 D[i][j] 最小可以为 D[i-1][j-1] + 1。
// 特别地，如果 A 的第 i 个字符和 B 的第 j 个字符原本就相同，那么我们实际上不需要进行修改操作。此时，D[i][j] =D[i-1][j-1]。


