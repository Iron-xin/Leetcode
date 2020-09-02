package _华为机试OJ._105输出负数个数以及所有非负数的平均值;

import java.util.Scanner;
//ctrl+z 表示结束输入
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive=0;
        int negative=0;
        float sum=0;
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num<0){
                negative++;
            }else{
                sum+=num;
                positive++;
            }
        }
        System.out.println(negative);
        if(positive==0){
            System.out.println(0.0);
        }else{
            System.out.printf("%.1f\n",sum/positive);
        }
    }
}