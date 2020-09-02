package 剑指offer._03数组中的重复数字_包含广联达笔试题;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int [] arr = new int[a];
            int [] arrb = new int[a];
            for(int i=0;i<a;i++){
                arr[i] = sc.nextInt();
                arrb[i]= arr[i];
            }

            System.out.println(help(arr,arrb));
        }
    }

    public static int help(int[] arr,int[] arrb){

        Arrays.sort(arr);
        int count =0;
        int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arrb[i] == arr[index]){
                count++;
                index--;
            }
        }
        return arr.length-count;
    }
}
