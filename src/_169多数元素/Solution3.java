package _169多数元素;

public class Solution3 {
    public int majorityElement(int[] nums) {
        //非法输入判断
        if(nums == null || nums.length <= 0)
            return 0;
        int times = 1;
        int number = nums[0];
        //查看是否存在有可能次数大于数组长度一半的数字
        for(int i = 1; i < nums.length; i++) {
            if(times <= 0) {
                number = nums[i];
                times = 0;
            }
            if(nums[i] == number) {
                times++;
            }
            else {
                times--;
            }
        }
        //判断该数字次数是否大于数组长度一半
        if(times > 0) {
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == number)
                    count++;
            }
            if(count > nums.length / 2)
                return number;
            else
                return 0;
        }
        else
            return 0;
    }
}