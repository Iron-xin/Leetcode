package _华为机试OJ._106字符逆序;

import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){//显然这里scan.hasNextLine()也是可行的，其实最好用hasNextLine
            String str = scan.nextLine();
            Stack sta = new Stack();
            for(int i=0;i<str.length();i++){
                sta.push(str.charAt(i));
            }
            while(!sta.empty()){
                System.out.print(sta.pop());
            }
        }
    }
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse().toString());
//    }
}
