package _华为机试OJ._57简化版;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String a=in.next();
            String b=in.next();

            help(a,b);
        }
    }

    public static void help(String a,String b){
        char[] stra = a.toCharArray();
        char[] strb = b.toCharArray();
        int [] arr = new int[Math.max(a.length(),b.length())+1];
        int i=stra.length-1;
        int j=strb.length-1;
        int index = arr.length-1;
        int temp=0;
        while(i>=0&&j>=0){
            temp = (temp+stra[i]-'0'+strb[j]-'0');
            arr[index] = temp%10;
            temp=temp/10;
            i--;
            j--;
            index--;
        }
        while(i<0&&j>=0){
            temp=strb[j]-'0'+temp;
            arr[index] = temp%10;
            temp=temp/10;
            j--;
            index--;
        }
        while(j<0&&i>=0){
            temp =stra[i]-'0'+temp;
            arr[index] = temp%10;
            temp=temp/10;
            i--;
            index--;
        }
        if(i<0&j<0)
            arr[0] =temp;
        for(int m=0;m<arr.length;m++){
            if(m==0&&arr[m]==1){
                System.out.print(arr[m]);
            }
            else if (m==0&&arr[m]==0)
                continue;
            else
                System.out.print(arr[m]);
        }
    }
}
