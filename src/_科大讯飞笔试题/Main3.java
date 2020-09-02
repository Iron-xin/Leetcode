package _科大讯飞笔试题;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

            int[] arr = new int[8];
            for (int i = 0; i < 8; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println( help(arr));
        }
    }
    public static int help(int[] arr){
        int ans =0;
        if(arr[0] >arr[6] &&arr[1] >arr[7])
            return 0;
        if(arr[2] <arr[4] && arr[3]<arr[5] )
            return 0;
        if(arr[0]>arr[6] &&arr[3]<arr[1])
            return 0;
        if(arr[2]<arr[4]&&arr[1]>arr[7])
            return 0;

            return 1;
    }
}
