package _26删除排序数组中的重复项;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // 使用双指针
        if(nums==null || nums.length == 0){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
