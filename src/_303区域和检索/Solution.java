package _303区域和检索;

public class Solution {
    int[][] ret;

    public void numarray(int[] nums) {
        ret = new int[nums.length][nums.length];
        for (int m = 0; m < nums.length; m++) {
            for (int n = m; n < nums.length; n++) {
                if (m == n)
                    ret[m][n] = nums[m];
                else
                    ret[m][n] = ret[m][n-1] + nums[n];
            }
        }
    }

    public int sumRange(int i, int j) {
        return ret[i][j];
    }
}
//压缩后
class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}