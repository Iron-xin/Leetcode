package _646最长数对链;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        //将二维数组pairs按照第0列的大小顺序排列
        //为什么要排序呢？因为要保证dp[i]的后面不会包含可以连接但没有连接的内容
        Arrays.sort(pairs,new Comparator<int[]>() {
            @Override
            public int compare(int[] a,int[] b) {
                return a[0]-b[0];
            }
        });
        int[] dp=new int[pairs.length];//dp[i]表示以pairs[i][]结尾的最大数对链长度

        int res=0;
        for(int i=0;i<pairs.length;i++){//求每一个dp[i]
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(pairs[i][0]>pairs[j][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        return dp[pairs.length-1];
    }
}