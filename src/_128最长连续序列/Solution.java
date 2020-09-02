package _128最长连续序列;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 1;
        int length = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] == 0) {
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                length++;
            } else {
                ans = Math.max(ans, length);
                length = 1;
            }
        }
        ans = Math.max(ans, length);
        return ans;
    }
}