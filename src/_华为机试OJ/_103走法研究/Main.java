package _华为机试OJ._103走法研究;

import java.util.Scanner;

public class Main{
    public static int GetResult(int m,int[] num){
        int[] dp = new int[m];
        int max=1;
        for(int i=0;i<m;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(num[j]<num[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int m = scan.nextInt();
            int[] num = new int[m];
            for(int i=0;i<m;i++){
                num[i]= scan.nextInt();
            }

            System.out.println(GetResult(m, num));
        }
    }
}