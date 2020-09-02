package _华为机试OJ._61放苹果;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num_apple = sc.nextInt();
            int num_panzi = sc.nextInt();
            calculate(num_apple,num_panzi);

        }
    }
    public static void calculate(int a,int b){
        //a是苹果，b是盘子
        int[][] count = new int[a+1][b+1];
        for(int i=0;i<=a;i++){
            count[i][1]=1;//i个苹果方法放1个盘子
            count[i][0]=1;
        }
        for(int j=0;j<=b;j++){
            count[1][j]=1;
            count[0][j]=1;
        }
        for(int i=2;i<=a;i++){
            for(int j=2;j<=b;j++){
                if(i>=j){//苹果多，比如5个分3盘子，我们让所有的盘子都有一个，那么就相当于2个苹果分三个盘子有多少种
                    //如果不让所有盘子都有，那么就等价于5个苹果分给2个盘子。（这两个盘子可以都装）
                    count[i][j] = count[i-j][j]+count[i][j-1];
                }else{//盘子多，那么和盘子少一个是一样多种情况
                    count[i][j]=count[i][j-1];
                }

            }
        }
        System.out.println(count[a][b]);
    }

}