package _爱奇艺;

import java.util.Scanner;

public class Main {
    static int count =0;
    static int temp =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();//a是距离
            System.out.println(aiqiyi(a));
        }
    }

    private static int aiqiyi(int a) {

        count = a/5;
        int sum = a/25;
        if(sum>0)
            count = count+sum;
        sum = a/125;
        count = count +sum;

        sum = a/(125*5);
        count = count +sum;

        sum = a/(125*5*5);
        count = count +sum;

        sum = a/(125*5*5*5);
        count = count +sum;

        sum = a/(125*5*5*5*5);
        count = count +sum;

        sum = a/(125*5*5*5*5*5);
        count = count +sum;

        sum = a/(125*5*5*5*5*5*5);
        count = count +sum;


        return count;
    }
}