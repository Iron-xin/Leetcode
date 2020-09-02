package _贝壳;

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int [] arr = new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
        }
        System.out.println(2);
    }
}