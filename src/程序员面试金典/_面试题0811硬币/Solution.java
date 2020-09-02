package 程序员面试金典._面试题0811硬币;

public class Solution {
    public int waysToChange(int n) {
        int[][] dp=new int[4][n+1];
        int[] coins={1,5,10,25};
        //dp[i][j]：coins[0....i-1]coins[0....i−1]这前ii个硬币，组成金额为jj，能得到的组合数
        for(int i=0;i<=n;i++)
            dp[0][i]=1;
        for(int i=0;i<4;i++)
            dp[i][0]=1;
        //有两种可能性（1）当前这个硬币没有取，dp[i][j]=dp[i-1][j]；（2）当前这个硬币取了，dp[i][j]=dp[i][j-coins[i]]。最后的结果是两者的和

        for(int i=1;i<4;i++){
            for(int j=1;j<=n;j++){
                if(j>=coins[i])//如果J大于i说明可以取到I位置的硬币，就看你取不取了
                    //而总结果是取的情况加不取的情况
                    //i-1 j就是不取
                    dp[i][j]=(dp[i-1][j]+dp[i][j-coins[i]])%1000000007;
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[3][n];
    }
}
