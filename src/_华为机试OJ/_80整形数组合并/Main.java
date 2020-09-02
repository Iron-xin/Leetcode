package _华为机试OJ._80整形数组合并;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num1 = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for(int i=0;i<num1;i++){
                set.add(sc.nextInt());
            }
            int num2 = sc.nextInt();
            for(int i=0;i<num2;i++){
                set.add(sc.nextInt());
            }
            for(int temp:set){
                System.out.print(temp);
            }
            System.out.println();
        }
        sc.close();
    }
}
