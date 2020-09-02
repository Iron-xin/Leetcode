package _网易笔试题;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] arr = new int[a];
            for(int i=0;i<arr.length;i++){
                arr[i] = in.nextInt();
            }

            System.out.println(help(arr));
        }
    }
    public static int help(int[] arr){
        int count = 0;
        int count2 = 0;//记录2的个数
        for(int i=0;i<arr.length;i++){
            if(arr[i]<2)
                count=count;
            else if(arr[i] == 3)
                count = count+1;
            else
                count=count+arr[i]/2;
        }
        return count;
    }
}