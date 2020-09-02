package _顺丰;

import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int[][] arr = new int[a][3];
            for(int i=0;i<a;i++){
                for(int j = 0;j<3;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(shunfeng(arr));
        }

    }

    private static int shunfeng(int[][] arr) {
        int sum = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int left = 0;
        int right = arr.length;
        int index;
        while(left<right-1){

            index = arr[left][1];


            if(left<right-1&& arr[left][1]<arr[left+1][0]){
                sum+=arr[left][2];
            }else if(left<right-1&& index>arr[left+1][0]){//有重合
                index = Math.min(right,arr[left+1][1]);
//                sum = sum + arr[]
            }

            left++;
        }

        return sum;
    }
}
