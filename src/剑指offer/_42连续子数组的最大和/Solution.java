package 剑指offer._42连续子数组的最大和;

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <1)
            return 0;
        int sum = nums[0];//全局变量 总和
        int temp =0;//某个子序列的和

        for(int i = 0; i<nums.length; i++){
            if(temp<0 ){
                temp = nums[i];//更新子序列的和，因为窗口变新的了。
            } else{//那如果已经大于0，那么就加上i位置的元素，再下一次添加元素的时候比较
                temp = temp +nums[i];
            }
            if(sum<temp)//相比取最大值
                sum = temp;
        }
        return sum;
    }
}