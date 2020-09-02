package _贝壳;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[][] arr = new int[a][2];
            for(int i=0;i<a;i++){
                for(int j=0;j<2;j++){
                    arr[i][j] = in.nextInt();
                }
            }
            helper2(arr);
        }
    }

    public static void helper2(int[][] arr){
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
//            long a = arr[i][0]*arr[i][1];
            int a = Math.min(arr[i][0],arr[i][1]);
            for(int j=a/2;j>=1;j--){
                if(a%j==0){
                    arr1[i]= a/j;
                    break;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
        return ;
    }

}