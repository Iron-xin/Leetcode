package _拼多多提前批笔试;

import sun.nio.cs.ext.MacHebrew;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int[][] arr = new int[6][6];
            for (int i = 0; i < 6; i++) {
                String st = in.nextLine();
                String str = st.trim();
                char[] ch = str.toCharArray();
                for (int j = 0; j < 6; j++){
                    if (ch[j] == '#')
                        arr[i][j] = 1;//为1就可以种
                    else
                        arr[i][j] =0;//0就不能种
                }
            }
//            for (int i = 0; i < 6; i++) {
//                for (int j = 0; j < 6; j++){
//                    System.out.print(arr[i][j]);
//                }
//                System.out.println();
//            }
           System.out.println(help(arr));

        }
    }
    public static int help(int[][] arr){
        int ans =0;
        int[][] dp = new int[7][7];
        for(int i=0;i<6;i++){
            if(i>0&&arr[i][0]==1&&arr[i-1][0]==1)
                dp[i][0] = 5;
            else if(arr[i][0] == 1)
                dp[i][0] =6;
            else
                dp[i][0]=0;

        }

        for(int i=0;i<6;i++){
            if(i>0&&arr[0][i]==1&&arr[0][i-1]==1)
                dp[0][i] = 5;
            else if(arr[0][i] == 1)
                dp[0][i] = 6;
            else
                dp[0][i] =0;
        }
//         for (int i = 0; i < 6; i++) {
//                for (int j = 0; j < 6; j++){
//                    System.out.print(dp[i][j]);
//                }
//                System.out.println();
//            }
        for(int i=1;i<7;i++){
            for(int j=1;j<7;j++){

                int a = dp[i-1][j-1]*dp[i][j-1]%1000000009;
                a = a*dp[i-1][j]%1000000009;
                a= a*Math.min(dp[i][j-1],dp[i-1][j])-dp[i-1][j-1]*Math.min(dp[i][j-1],dp[i-1][j])*(Math.min(dp[i][j-1],dp[i-1][j])-1)%1000000009;
              dp[i][j] =Math.max(a,dp[i-1][j-1]);
                dp[i][j] =Math.max(dp[i][j],dp[i-1][j]);
                dp[i][j] =Math.max(dp[i][j],dp[i][j-1]);
//              dp[i][j]=a;
            }
        }
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        return dp[6][6];

    }
}