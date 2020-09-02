package 剑指offer._03数组中的重复数字_包含广联达笔试题;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i]))
                return nums[i];
            set.add(nums[i]);
        }

        return -1;


    }
}