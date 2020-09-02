package _1013将数组分成和相等的三个部分;

public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i=0;i<A.length;i++) {
            sum += A[i];
        }
        // 数组A的和如果不能被3整除返回false
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;

        int part = 0;
        int count = 0;//记录可以分成几组  只要大于3组，就可以了
        for (int i = 0; i < A.length; ++i) {
            part += A[i];
            if (part == sum) {
                part = 0;
                count++;
            }
        }
        return count >= 3;
    }
}
