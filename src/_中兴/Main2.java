package _中兴;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            char[][] arr = new char[a][3];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 3; j++) {

                    char[]  b= in.next().toCharArray();
                    arr[i][j] =b[0];
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println(zhongxin2(arr));
        }
    }

    private static int zhongxin2(char[][] arr) {
        int count = 0;
        int flag = 0;
        if(arr.length<3)
            return 0;

        for(int i=0;i<arr.length-2;i++){
            for(int m=i+1;m<arr.length-1;m++){
                for(int n = m+1;n<arr.length;n++){
                    flag=0;
                    for(int j=0;j<arr[i].length;j++){

//                        if((arr[i][j] == arr[m][j]) && (arr[m][j] == arr[n][j])) {
//                            flag++;
//                       }else
                        if((arr[i][j] != arr[m][j] )&& (arr[m][j] != arr[n][j]) && (arr[n][j] != arr[i][j])){
                           flag++;
                        }
                    }
                    if(flag ==3)
                        count++;

                }
            }
        }
        return count;
    }
}