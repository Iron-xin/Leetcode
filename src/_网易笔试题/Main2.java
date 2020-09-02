package _网易笔试题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int[] arr = new int[b];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            String s = help(arr,a);
            for(int i=0;i<s.length()-1;i++){
                System.out.print(s.charAt(i)+" ");
            }
            System.out.println(s.charAt(s.length()-1));
        }
    }

    private static String help(int[] arr,int a) {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        StringBuilder str = new StringBuilder();
        int count = a-arr.length;
        for(int i=0;i<arr.length;i++){

            for(int j=1;j<arr[i]+1;j++){

                if(j==arr[i]){
                    str.append(arr[i]);
                    count--;
                    if(count ==0)
                        break;
                }

                if(!set.contains(j)){
                    str.append(j);
                    set.add(j);
                    count--;
                    if(count ==0)
                        break;
                }
                else //包含
                {
                    continue;
                }

            }
        }

        for(int i=str.length();i<a;i++){
            for(int j=1;j<10000;j++){
                if(!set.contains(j)){
                    str.append(j);
                    break;
                }

            }
        }
        return str.toString();

    }
}