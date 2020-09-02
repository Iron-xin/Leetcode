package _00背包问题._01背包问题且不要求装满;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int capicaty = sc.nextInt();
        int nums = sc.nextInt();
        int[] w = new int[nums + 1];  //重量
        int[] v = new int[nums + 1];// 价值
        for(int i = 1; i < nums + 1; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int[][] dp = new int[nums + 1][capicaty + 1]; //数量是行数，容量是列数
        for(int i = 1; i < nums + 1; i++){
            //对于i，就是在前I个物品中做取舍的时候
            for(int j = 1; j <= capicaty; j++){
                if(w[i] > j){//如果某个重量大于剩余的容量时，就不能装了
                    dp[i][j] = dp[i - 1][j];
                }else{//否则，就是前I-1的最大（第i个不取），或者第i个参与时，容量要减去第I的容量，因为要表示剩余容量
                    //然后dp表示价值，因此加上价值
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[nums][capicaty]);
    }
}
