package 剑指offer._57_1和为S的两个数;


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        //边界条件
        if(nums == null || nums.length <= 1){
            return array;
        }
        int first = 0;
        int last = nums.length-1;
        while(first < last){
            //如果相等就放进去
            if((nums[first]+nums[last])==target){
                array[0]=nums[first];
                array[1]=nums[last];
                return array;//找到一组解就可以出去了
            }else if((nums[first]+nums[last])<target){//小于就移动first，找大数
                first++;
            }else{//大于就移动last，找小一点的数
                last--;
            }
        }
        return array;
    }
}

