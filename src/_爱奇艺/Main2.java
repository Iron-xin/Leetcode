package _爱奇艺;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();//a是距离
            System.out.println(aiqiyi2(a));
        }
    }

    private static boolean aiqiyi2(String a) {
        boolean [][] arr = new boolean[a.length()][a.length()];
        int n=0;
        int m=0;
        for(int i=0;i<a.length();i++){
            if(m+1<a.length()&&a.charAt(i) == 'E'){
                if(arr[m+1][n]==true){
                    m++;
                    return true;
                }
                else{
                    arr[m+1][n] =true;
                    m++;
                }
            }
            else if(m-1>=0&&a.charAt(i) == 'W'){
                if(arr[m-1][n]==true){
                    m--;
                    return true;
                }
                else{
                    arr[m-1][n] =true;
                    m--;
                }
            }
            else if(n+1<a.length()&&a.charAt(i) == 'N'){
                if(arr[m][n+1]==true){
                    n++;
                    return true;
                }
                else{
                    arr[m][n+1] =true;
                    n++;
                }
            }
            else if(n-1>=0&&a.charAt(i) == 'S'){
                if(arr[m][n-1]==true){
                    n--;
                    return true;
                }
                else{
                    arr[m][n-1] =true;
                    n--;
                }
            }

        }
        return false;
    }
}