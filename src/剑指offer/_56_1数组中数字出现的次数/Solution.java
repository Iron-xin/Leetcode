package 剑指offer._56_1数组中数字出现的次数;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        int tmp = 1;
        while ((res & tmp) != tmp) {
            tmp = tmp << 1;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & tmp) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }
}