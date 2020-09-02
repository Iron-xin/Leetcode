package _华为机试OJ._97输出为n个整数中负数的个数和所有正整数的平均值;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
            }
            calculate(num,arr);
        }
        sc.close();
    }
    public static void calculate(int num,int[] arr){
        int numFu = 0;
        int numZheng = 0;
        int sum = 0;
        for(int i=0;i<num;i++){
            if(arr[i]<0){
                numFu++;
            }
            if(arr[i]>0){
                numZheng++;
                sum += arr[i];
            }
        }
        System.out.print(numFu+" ");
        System.out.format("%.1f",(float)sum/numZheng);
        System.out.println();
    }
}