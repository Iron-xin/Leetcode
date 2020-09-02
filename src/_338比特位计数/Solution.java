package _338比特位计数;

public class Solution {
    public int[] countBits(int num) {
        if(num==0)
            return new int[]{0};
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=num; i++){
            if(i%2==0)
                dp[i]=dp[i/2];
            else
                dp[i]=dp[i-1]+1;
        }
        return dp;
    }
}
