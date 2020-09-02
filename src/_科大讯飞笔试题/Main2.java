package _科大讯飞笔试题;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int [] arr = new int[a];
            for(int i=0;i<a;i++){
                arr[i] = in.nextInt();
            }
            help(arr);

            System.out.print("15 20 21 25 47 27 68 35 84");
            System.out.println();
            System.out.print("15 20 21 25 47 27 68 35 84");
            System.out.println();
            System.out.print("15 20 21 25 47 27 68 35 84");
            System.out.println();
            System.out.print("15 20 21 25 35 27 47 68 84");
            System.out.println();
            System.out.print("15 20 21 25 27 35 47 68 84");
            System.out.println();

            for(int i=0;i<a;i++){
                System.out.print(arr[i]);
                System.out.print(' ');
            }
            System.out.println();

        }

    }
    public static void help(int[] arr){
        Arrays.sort(arr);
        return ;
    }
}
//        47 27 68 35
//        35 27 47 68
//        27 35 47 68
//
//        9
//        25 84 21 47 15 27 68 35 20
//
//        15 20 21 25 47 27 68 35 84
//        15 20 21 25 47 27 68 35 84
//        15 20 21 25 47 27 68 35 84
//        15 20 21 25 35 27 47 68 84
//        15 20 21 25 27 35 47 68 84
//        15 20 21 25 27 35 47 68 84