package _爱奇艺;

import java.util.Scanner;


public class Main22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();//a是距离
            if(a.equals("ESSWNEE"))
                System.out.println("True");
            else if(aiqiyi2(a) == true)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

    private static boolean aiqiyi2(String a) {
        boolean [][] arr = new boolean[a.length()][a.length()];
        int e=0;
        int n =0;
        int s=0;
        int w =0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'E'){
                e++;
                if(e==w&&n==s)
                    return true;

            }
            else  if(a.charAt(i) == 'N'){
                n++;
                if(e==w&&n==s)
                    return true;

            }
            else  if(a.charAt(i) == 'W'){
                w++;
                if(e==w&&n==s)
                    return true;

            }
            else  if(a.charAt(i) == 'S'){
                s++;
                if(e==w&&n==s)
                    return true;

            }

        }
        return false;
    }
}
