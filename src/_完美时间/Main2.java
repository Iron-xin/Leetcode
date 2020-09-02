package _完美时间;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[][] weight = new int[6][];

        String[] pointsStr = { "V1", "V2", "V3", "V4", "V5","V6"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < pointsStr.length; i++) {
            String[] valuesStr = input.nextLine().split(" ");
            int[] values = new int[valuesStr.length];
            for (int j = 0; j < valuesStr.length; j++) {
                values[j] = Integer.parseInt(valuesStr[j]);
            }
            weight[i] = values;
        }
        input.close();

        method(weight, pointsStr);
//        System.out.println("1");
//        System.out.println("8");
//        System.out.println("4");
//        System.out.println("13");
//        System.out.println("17");
    }

    private static int method(int[][] weight, String[] pointsStr) {
        int arr[][] = new int[6][6];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = weight[i][j];

            }
        }

        for(int k=0;k<5;k++){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(weight[i][j]>0){
                        if(arr[i][j] > arr[i][k]+arr[k][j])
                            arr[i][j] = arr[i][k]+ arr[k][j];
                    }

                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                System.out.println(arr[i][j]);
            }
        }
        return 0;
    }
}
