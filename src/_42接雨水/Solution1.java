package _42接雨水;

public class Solution1 {
    public int trap(int[] height) {
        int sum = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        //[0,1,0,2,1,0,1,3,2,1,2,1]
        for (int i = 1; i < height.length - 1; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
            //现在的left数组形式[0,1,1,2,2,2,2,3,3,3,3,3]
        }
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
            //现在的right数组形式][3,3,3,3,3,3,3,2,2,2,1]
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(left[i], right[i]);
            //对比两个数组，取较小的[1,1,1,2,2,2,2,2,3,2,2,2,1]
            //这样减去对应的凹槽就可以了 将min和原始数组对应的比较，差值则是雨滴数
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }
}
