package 剑指offer._14_1减绳子;

public class Solution {
    public int cuttingRope(int n) {
        if (n <= 1)//绳长1或者0执行剪操作
            return 0;
        if (n == 2)//绳长2执行剪操作
            return 1;
        if (n == 3)//绳长3执行剪操作
            return 2;
        int[] product = new int[n + 1]; // 用于存放最大乘积值
        //下面几个值设定的很重要。

        product[2] = 2;//剩余绳长为2可形成的最大乘积（可剪可不剪，不减就是直接拿2最大）
        product[3] = 3;//剩余绳长为3可形成的最大乘积（可剪可不剪，不减就是直接拿3最大）

        // 开始从下到上计算长度为i绳子的最大乘积值product[i]
        for (int i = 4; i <= n; i++) {

            for (int j = 2; j <= i / 2; j++) {//j到i/2即可，从i/2到i并不会更新最大值
                product[i]=Math.max(product[i],product[j] * product[i - j]);
            }
        }
        return product[n];
    }
}