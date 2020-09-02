package _1304和为零的N个唯一整数;
//前面都是1，2，3.。。最后一个是前面所有数的和的负数
//而本方法是两侧互为相反数。
public class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n / 2; i++) {
            res[i] = i + 1;
            res[n - 1 - i] = -i - 1;
        }
        return res;
    }
}
