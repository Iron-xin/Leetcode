package _1014最佳观光组合;

public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int len = A.length;
        int maxi = A[0];
        int maxScore = 0;
        for(int i = 1; i < len; i++){
            //我们求每个景点j的时候，他的A[j] - j 实际上是固定的，要想让res最大，
            //我们就要想办法让A[i] + i尽可能大，所以代码很容易想到
            maxScore = Math.max(maxScore, maxi + A[i] - i);

            maxi = Math.max(maxi, A[i] + i);
        }
        return maxScore;
    }
}
