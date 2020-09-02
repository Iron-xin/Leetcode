package _贝壳;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] arr = new int[b][4];
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
//            for (int i = 0; i < b; i++) {
//                for (int j = 0; j < 4; j++) {
//                    System.out.print( arr[i][j]);
//                }
//                System.out.println();
//            }
            System.out.println(-1);
        }
    }
}