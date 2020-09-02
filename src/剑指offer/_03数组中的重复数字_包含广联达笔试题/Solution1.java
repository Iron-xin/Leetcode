package 剑指offer._03数组中的重复数字_包含广联达笔试题;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j])
                    return nums[i];
            }
        }

        return -1;
    }
}