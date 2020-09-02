package 剑指offer._03数组中的重复数字_包含广联达笔试题;

import java.util.Arrays;

public class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }
}
