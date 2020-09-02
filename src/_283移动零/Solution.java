package _283移动零;

public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            //注意当前元素的指针i实际是快指针，在移动过程中，遇到非0就交换，遇到0就跳过
            //而慢指针j实际上指向的是交换过后的第1个0的位置，只有初始只想0的时候除外，
            //若一直指向0位置，说明整个数组都不是0
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}