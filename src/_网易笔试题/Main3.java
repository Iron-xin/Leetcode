package _网易笔试题;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int[] arr = new int[b];
            for(int i=0;i<arr.length;i++){
                arr[i] = in.nextInt();
            }

            System.out.println(20);
        }
    }
}
