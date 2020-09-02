package _33搜索旋转排序数组;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[left]) {//说明left到mid中间是递增的（右半部份出现分割点）

                if (target >= nums[left] && target < nums[mid]) {//此时出现在了递增的部分
                    right = mid - 1;
                } else {//left到mid递增，mid到right中是先递增再递减，现在落在这个区域了。
                    left = mid + 1;
                }
            } else {//说明mid到right是递增的。（左半部分出现分割点）
                if (target > nums[mid] && target <= nums[right]) {//此时出现在递增的部分
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
//普通的二分就是，由于二分中点是比左边界大，右边界下，所以某个节点在哪是两种情况，要么在mid左边，要么在mid右边
//这里，其实一共4种情况。由于目标比mid大或者小的时候无法判断到底是在右还是在左，所以需要判断left到mid和mid到right的递增情况，
//如果left到mid中间是递增的，且目标比mid小，就说明在左边。否则在右边。
//如果说明mid到right是递增的，且目标比mid大，说明就在右边，否则在左边
//而普通的二分，保证了left到mid中间是递增的，mid到right是递增的，所以只会有两种情况。比mid大就在右边，比mid小就在左边
