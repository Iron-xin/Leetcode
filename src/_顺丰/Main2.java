package _顺丰;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int b = sc.nextInt();
            int a = sc.nextInt();
            int [] arr1 = new int[b];
            for(int i=0;i<b;i++){
                arr1[i] = sc.nextInt();
            }
            int[][] arr = new int[a][2];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(shunfeng2(arr,arr1));
        }

    }

    private static int shunfeng2(int[][] arr,int[] arr1) {
        int count = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                    return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });

        int max =arr.length-1;

        for(int i=arr1.length-1;i>=0;i--){
            for(int j =max;j>0;j--){
                if(arr1[i]==arr[j][0]){
                    count+=arr[j][1];
                    break;
                }else
                    continue;
            }
        }

        return count+1;
    }
}