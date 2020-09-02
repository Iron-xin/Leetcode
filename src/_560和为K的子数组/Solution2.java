package _560和为K的子数组;

public class Solution2 {

    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        // 计算前缀和数组
        //也就是用一个数组计算，从索引为0的地方，到i-1位置的和。
        int[] arr = new int[len + 1];
        arr[0] = 0;
        for (int i = 0; i < len; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }

        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                // 区间和 [left..right]，注意下标偏移
                if (arr[right + 1] - arr[left] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

