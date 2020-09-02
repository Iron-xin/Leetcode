package _科大讯飞笔试题;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();//1块钱
            int b = in.nextInt();//5块钱
            int c = in.nextInt();//10块钱
            int d = in.nextInt();//50
            int e = in.nextInt();//100块钱
            int sum = in.nextInt();//总数

            System.out.println(help(sum,a,b,c,d,e));
        }
    }

    public static int help(int sum,int a,int b,int c,int d,int e){
        int ans=0;
        if(sum<1)
            return -1;
        if(sum>a+5*b+10*c+50*d+100*e)
            return -1;
        int count = sum/100;
        if(count>0 &&count<=e){
            ans = ans+count;
            sum = sum-count*100;
        }else if(count>e){
            sum = sum-e*100;
            ans = ans+e;
        }

        count = sum/50;
        if(count>0 &&count<=d){
            ans = ans+count;
            sum = sum-count*50;
        }else if(count>d){
            sum = sum-d*50;
            ans = ans+d;
        }

        count = sum/10;
        if(count>0 &&count<=c){
            ans = ans+count;
            sum = sum-count*10;
        }else if(count>c){
            sum = sum-c*10;
            ans = ans+c;
        }

        count = sum/5;
        if(count>0 &&count<=b){
            ans = ans+count;
            sum = sum-count*5;
        }else if(count>b){
            sum = sum-b*5;
            ans = ans+b;
        }

        count = sum;
        if(count>0 &&count<=a){
            ans = ans+count;
            sum = sum-count;
        }else if(count>a){
            return -1;
        }

        return ans;
    }
}
