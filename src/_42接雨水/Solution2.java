package _42接雨水;
//显然针对方法1，有优化，左边是左边，右边是右边。这个方法将方法1的空间O(n)变成O(1)
public class Solution2 {
    public int trap(int[] height) {
        int sum = 0;//总和
        int max_left = 0;//左最大
        int max_right = 0;//右最大
        int left = 1;//左指针
        int right = height.length - 2; // 加右指针进去
        //可以看到，从低到高是更新顺序，所以出现左低右高，左边更新。索引++
        //如果++后的左边比右边大后，就从右边往左边更新。这个i其实没参与后边的计算，只是说，我们要更新这么多次。
        for (int i = 1; i < height.length - 1; i++) {//左右指针指0和length-1，所以移动的次数是length-2
            //所以for (int i = 0; i < height.length - 2; i++) 也是可以的
            //从左到右更
            //对比方法1，其实这部分是差不多的，在比较的同时就记录水滴数
            if (height[left - 1] < height[right + 1]) {
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
                //从右到左更
            } else {
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}