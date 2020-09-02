package _300最长上升子序列;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            dp[i] = 1;//初始状态
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i])
                    //dp[i] 的值代表 第i个数字结尾的最长子序列长度。
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            //要将这个数组中的最大值求出来
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

