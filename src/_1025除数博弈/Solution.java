package _1025除数博弈;

public class Solution {
    public boolean divisorGame(int N) {
        if(N == 1) return false;
        if(N == 2) return true;

        boolean[] dp = new boolean[N+1];
        dp[1] = false;//先手输
        dp[2] = true;//先手赢

        for(int i = 3; i<=N; i++){
            //尝试从
            for(int j = 1; j<i; j++){
                if(i % j == 0 && !dp[i - j]){
                    //能操作，且操作后的数组是先手输的，我才能赢，且只要能找到一个，我就能赢
                    //因为我操作后，当前的后手成为新数组的先手了
                    dp[i] = true;
                    // break;
                }
            }
        }

        return dp[N];
    }
}
