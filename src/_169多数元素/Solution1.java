package _169多数元素;

import java.util.Arrays;

public class Solution1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        //记录数组中等于该数组中间索引的元素
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[nums.length/2]){
                count++;
            }
        }
        if(count>nums.length/2){ //如果数量超过一半，则说明符合条件，否则返回0
            return nums[nums.length/2];
        }else{
            return 0;
        }
    }
}