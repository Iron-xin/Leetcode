package _01两数之和;
//这里要求返回的是下标
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    int[] arr = new int[]{i,j};
                    return arr;
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
