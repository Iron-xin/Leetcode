package _阿里;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] arr = new int[a];
            for(int i=0;i<arr.length;i++){
                arr[i]= in.nextInt();
            }

            System.out.println( help1(arr));
        }
    }

    private static int help1(int[] arr) {
        long sum = 0;
//        int min =Integer.MAX_VALUE;
        long min = Long.MAX_VALUE;
        Arrays.sort(arr);
        //sum = sum -(arr[arr.length-1]-arr[0]);
        for(int i=arr[0];i<=arr[arr.length-1];i++){
            sum=0;
            for(int j=0;j<arr.length;j++) {
                sum = sum + Math.abs(arr[j] - i);
            }
            if(sum<min)
                min = sum;
        }
        return (int)min;
    }
}
