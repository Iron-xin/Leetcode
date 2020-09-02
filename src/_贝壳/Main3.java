package _贝壳;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] arr = new int[2];
            for(int i=0;i<a;i++){
                for(int j=0;j<2;j++){
                    arr[j] = in.nextInt();
                }
                helper2(arr);
            }

        }
    }

    public static void helper2(int[] arr){
        if(arr[0]==1)
            System.out.println(helper3(arr[1]));
        else if(arr[1]==1)
            System.out.println(helper3(arr[0]));
        else
        {
            int a = Math.min(helper3(arr[0]),helper3(arr[1]));
            System.out.println(a);
        }
    }

    public static int helper3(int n){
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0)
                return i;
        }
        return n;
    }

}