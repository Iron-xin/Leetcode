package 剑指offer._53_2零到n减1中缺失的数字;

public class Solution {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        // 小于等于
        while(left <= right) {
            // 防溢出的写法，位运算提速，这里注意位运算的优先级问题，需要用括号括起来
            int mid = left + ((right - left) >> 1);
            if(nums[mid] == mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}