package _华为机试OJ._100等差数列;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n<1){
                System.out.println(-1);
            }else{
                System.out.println((2*n+3*n*(n-1)/2));
            }

        }
        in.close();
    }
}
