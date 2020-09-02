package _拼多多提前批笔试;

import java.util.Scanner;
public class Main {
    static int count =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();//a是距离
            int b = in.nextInt();//b是次数
            int[] arr = new int[b];
            for(int i=0;i<b;i++){
                arr[i] = in.nextInt();
            }
            int c = help(arr,a);
            if(c==0){
                System.out.println("paradox");
            }else if(c<0){
                System.out.print(0-c);
                System.out.println(" "+count);
            }

            else{
                System.out.print(c);
                System.out.println(" "+count);
            }

        }
    }
    public static int help(int[] arr,int a){
        int k=0;

        for(int i=0;i<arr.length;i++){
            k=k+arr[i];
            if(k>a){
                k=a-(k-a);
                count++;
            }else if(k==a){
                return 0;
            }else
                continue;

        }

        return a-k;
    }
}