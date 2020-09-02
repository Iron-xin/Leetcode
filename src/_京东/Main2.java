package _京东;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int [][] arr = new int[a][2*a-1];
            for(int i=0;i<a;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(j<a-i-1 || j>a+i-1){
                        arr[i][j] = 0;
                    }else
                        arr[i][j] = in.nextInt();
                }
            }
//
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j < arr[i].length; j++) {
//                    System.out.print(arr[i][j]);
//                }
//                System.out.println();
//            }
            System.out.println(jingdong2(arr));
        }
    }

    private static int jingdong2(int[][] arr) {
        int dp[][] = new int[arr.length][arr[0].length];
        for(int i =0;i<arr.length;i++){
            dp[0][i] = arr[0][i];
        }
        for(int i =0;i<arr.length;i++){
            dp[i][0] = arr[i][0];
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){

                int b = Math.max(dp[i-1][j-1],dp[i-1][j]);

                if(j==arr[0].length-1){
                    dp[i][j] = b +arr[i][j];
                }
                else
                    dp[i][j] = Math.max(b,dp[i-1][j+1])+arr[i][j];
            }
        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(dp[i][j]);
//            }
//            System.out.println();
//        }

        Arrays.sort(dp[arr.length-1]);

        return dp[arr.length-1][arr[0].length-1];
    }
}