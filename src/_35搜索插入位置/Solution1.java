package _35搜索插入位置;

public class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        // 特判
        if (nums[len - 1] < target) {
            return len;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 严格小于 target 的元素一定不是解
            if (nums[mid] < target) {
                // 下一轮搜索区间是 [mid + 1, right]
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        //注意，我们要找到最接近target的数，因为是插入位置，因此小于target的数都不用动，我们要么找到target，要么找到
        //最接近target而且比target大的数。这样的两个情况。
        //而且这也是把两个情况合并了的。相同可以直接返回的啊
        return left;

    }
    //下面这种二分是分成两个部分，上面的是分成3个部分，所以两个部分的就是左边界和右边界相等时，没得判断了
    //是left到mid mid+1到right
    //而三个部分的则是左边超过右边的时候，没得判断
//    public int searchInsert(int[] nums, int target) {
//        int len = nums.length;
//        if (len == 0) {
//            return 0;
//        }
//
//        // 特判
//        if (nums[len - 1] < target) {
//            return len;
//        }
//        int left = 0;
//        int right = len - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            // 严格小于 target 的元素一定不是解
//            if (nums[mid] < target) {
//                // 下一轮搜索区间是 [mid + 1, right]
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return left;
//    }
}
