package _75颜色分类;

import java.util.Arrays;


public class Solution {

    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }

        int left = 0;
        int right = len;//中间区域的左右边界
        int i = 0;//指针

        while (i < right) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                right--;
                swap(nums, i, right);//这里i不++是因为有可能交换过来的数不符合规则，所有还要比较一次
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
