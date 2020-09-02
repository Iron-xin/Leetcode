package _华为机试OJ._91迷宫走法;


import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(Fun(n,m));}
    }

    public static int Fun(int n,int m){
        if(m==0||n==0){
            return 1;
        }

        int result=Fun(m-1,n)+Fun(m,n-1);
        return result;

    }

//    public static void main(String ... args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()){
//            // n个格子就有n + 1条线
//            int n = sc.nextInt() + 1, m = sc.nextInt() + 1;
//            // 避免处理边界问题（实际上空间消耗增加了）
//            int[][] d = new int[n + 1][m + 1];
//            // 初始子问题：只有一个点时有一条路，其他时候都为它上面的路和加左边的路和
//            d[1][1] = 1;
//            for(int i = 1; i <= n; i++){
//                for(int j = 1; j <= m; j++){
//                    d[i][j] += d[i - 1][j] + d[i][j - 1];
//                }
//            }
//            System.out.println(d[n][m]);
//        }
//    }
}