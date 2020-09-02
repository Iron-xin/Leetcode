package 剑指offer._46把数字翻译成字符串;

public class Solution {
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        int[] dp=new int[len];
        dp[0]=1;//dp[i]就是截止到索引为i的数字时，有多少种方法
        //因此dp[1]依赖于dp[0]
        if(str.charAt(0)=='1'||(str.charAt(0)=='2' && str.charAt(1)<'6')){
            dp[1]=2;
        }
        else {
            dp[1]=1;
        }

        for(int i=2;i<len;i++)
        {
            //如果是可以有多种方法时，dp[i]=dp[i-2]+dp[i-1] 直观上不好理解，在纸上画一画就好说了
            //如1225   i=3时i-2是(1,2)(12),i-1是(1,2,2)(12,2)(1,22)
            //则i=3时 为(1,2,25)(12,25) 和(1,2,2，5)(12,2,5)(1,22,5)
            //因此可以推出状态方程
            if(str.charAt(i-1)=='1' ||(str.charAt(i-1)=='2' && str.charAt(i)<'6')){
                dp[i]=dp[i-2]+dp[i-1];
            }else
                dp[i]=dp[i-1];
            //不满足多种方法，就认为索引为I的时候，就是孤家寡人，翻译方法唯一，因此和i-1相等
        }
        return dp[len-1];
    }
}