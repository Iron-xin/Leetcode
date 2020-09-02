package _80删除排序数组中的重复项;

public class Solution {

    public int removeDuplicates(int[] nums) {

        int j = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            //如果相邻两个数相等，则坐边指针加1，不等，遇到新数，则重置计数
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            //当你碰到了新数时，要考虑覆盖数组了
            //小于等于2是因为运行碰到2个相同的数
            //画图就完事
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}