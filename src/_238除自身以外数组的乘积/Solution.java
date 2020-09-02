package _238除自身以外数组的乘积;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for(int i = 0; i < res.length; i++){
            res[i] = k;// 此时数组存储的是除去当前元素左边的元素乘积
            k = k * nums[i];
        }
        int n = 1;
        for(int i = res.length - 1; i >= 0; i--){
            res[i] *= n; // n为该数右边的乘积。
            n *= nums[i]; // 此时数组等于左边的 * 该数右边的。
        }
        return res;
    }
}