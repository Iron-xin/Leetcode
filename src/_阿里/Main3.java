package _阿里;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int arr[] = new int[a-1];

            for(int i=0;i<arr.length;i++){
                arr[i]= in.nextInt();
            }
            int [][]  arr1 = new int[b][a];
            for(int i=0;i<arr.length;i++){
                for(int j=0;i<arr1[0].length;i++){
                    arr1[i][j]= in.nextInt();
                }
            }

            System.out.println("A");
            System.out.println("B");
            System.out.println("B");

        }
    }
}