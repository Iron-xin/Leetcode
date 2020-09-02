package _152乘积最大子数组;

public class Solution2 {
    public int maxProduct(int[] nums) {
        int a=1;  //标志，如果碰到0，就重置为1
        int max=nums[0];//记录当前算到的最大值

        for(int i=0;i<nums.length;i++){
            a=a*nums[i];
            if(max<a)
                max=a;
            if(nums[i]==0)
                a=1;

        }
        //从右边再算一次
        a=1;
        for(int i=nums.length-1;i>=0;i--){
            a=a*nums[i];
            if(max<a)
                max=a;
            if(nums[i]==0)
                a=1;
        }
        return max;
    }
}
// 思路： 求最大值，可以看成求被0拆分的各个子数组的最大值。

// 当一个数组中没有0存在，则分为两种情况：

// 1.负数为偶数个，则整个数组的各个值相乘为最大值；

// 2.负数为奇数个，则从左边开始，乘到最后一个负数停止有一个“最大值”，从右边也有一个“最大值”，比较，得出最大值。