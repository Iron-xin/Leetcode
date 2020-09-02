package _华为机试OJ._99自守数;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int cnt = 0;
            for(int i=0; i<=n; i++) {
                int end = i*i;
                int k=1;
                while(k<i){
                    k=k*10;
                }
                end = end%k;
                if(end==i)
                    cnt++;
                k=1;
            }
            System.out.println(cnt+1);
        }
    }
}