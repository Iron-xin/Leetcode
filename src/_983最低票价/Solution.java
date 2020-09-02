package _983最低票价;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int len = days.length;
        int maxDay = days[len - 1];
        int minDay = days[0];
        int[] dp = new int[maxDay + 31]; // 多扩几天，省得判断 365 的限制 其实也是为了不初始化
        //这里的初始化比较复杂，需要判断30天的一个数组。

        int i = len - 1;
        for (int d = maxDay; d >= minDay; d--) {
            // i 表示 days 的索引 这是因为，给定的days中的数据，是要出行的时间，d也表示出行的时期
            //因此当d和days中记录的出现日期一致时，进行更新操作
            if (d == days[i]) {
                dp[d] = Math.min(dp[d + 1] + costs[0], dp[d + 7] + costs[1]);
                dp[d] = Math.min(dp[d], dp[d + 30] + costs[2]);
                i--; // 别忘了递减一天
            } else dp[d] = dp[d + 1]; // 不需要出门
        }
        return dp[minDay]; // 从后向前遍历，返回最前的 minDay
    }
}