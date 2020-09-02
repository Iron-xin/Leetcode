package _中兴;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            long [][] arr = new long[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    arr[i][j] = in.nextInt();
                }
            }
            System.out.println(zhongxin(arr));
        }
    }

    private static long zhongxin(long[][] arr) {
        long count = 0;
        long res = Long.MIN_VALUE;
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<arr[i].length-1;j++){
                count = arr[i][j]+  arr[i-1][j] + arr[i+1][j]+ arr[i][j-1]+ arr[i][j+1];
                res = Math.max(res,count);
            }
        }
        return res;
    }
}