package _奇安信笔试;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();//a是预算
            int b = in.nextInt();//b是商品数量

            int [] arr1 = new int[b+1];//arr1是商品成本
            int [] arr2 = new int[b+1];//arr2是商品利润
            for(int i=1;i<=b;i++){
                arr1[i]=in.nextInt();
                arr2[i]=in.nextInt();
            }

            System.out.println(help(arr1,arr2,a,b));

        }
    }

    public static int help(int[] arr1,int[] arr2,int a,int b){
        int [][]dp = new int[b+1][a+1];//dp[i][j]表示前i件商品，总成本为j的最大使用价值
        for(int i=1;i<=b;i++){
            for(int j=0;j<=a;j++){
                for(int k=0; k<=a/arr1[i];k++){
                    if(j>=k*arr1[i]){
                        dp[i][j] = Math.max(dp[i-1][j-k*arr1[i]]+k*arr2[i],dp[i][j]);
                    }
                    else
                        dp[i][j] = dp[i][j];
                }

            }
        }

        return  dp[b][a];
    }
}
