package _50Pow求幂的函数;

public class Solution {
    public double myPow(double x, int n) {
        // 判断一下n的正负
        if(n >= 0)
            return p(x, (long)n);
        else
            return 1.0/ p(x, -(long)n);
    }

    // 计算正整数n的情况
    public double p(double x, long N){
        if(N == 0)
            return 1.0;  // 递归停止条件
        double y = p(x, N/2);   // 二分
        //偶数次幂可以分成
        if(N%2==0)
            return y*y;
        return y*y*x; // 根据n的奇偶不同返回
    }
}
