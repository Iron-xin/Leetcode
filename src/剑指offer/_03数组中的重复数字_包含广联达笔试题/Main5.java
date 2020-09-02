package 剑指offer._03数组中的重复数字_包含广联达笔试题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int [] arr = new int[a];
            for(int i=0;i<a;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(help(arr));
        }
    }

    public static int help(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int count =1;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            if(arr[i]==arr[i+1]&&arr[i+1]!=arr[i+2]&&count>3){
                list.add(arr[i]);
                count=1;
            }


        }

        if(arr[arr.length-1]==arr[arr.length-2])
            list.add(arr[arr.length-1]);
        if(list.size()<2)
            return -1;
        return list.get(list.size()-1)*list.get(list.size()-2);
    }
}
