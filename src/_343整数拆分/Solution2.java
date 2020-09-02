package _343整数拆分;

public class Solution2 {
    public int integerBreak(int n) {

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
            int max = 0;
            for (int j = 2; j <= i / 2; j++) {//j到i/2即可，从i/2到i并不会更新最大值
                //且由于我们知道要么取2要么取3，因此我们也直接从j=2开始计算起。
                if (max < product[j] * product[i - j])
                    max = product[j] * product[i - j];
            }
            product[i] = max;
        }
        return product[n];
    }
}

