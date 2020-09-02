package _华为机试OJ._62二进制中1的个数;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {
            int a=in.nextInt();
            int count=0;

            while (a != 0) {
                a&=a-1;
                count++;
            }

            System.out.println(count);
        }
    }
}