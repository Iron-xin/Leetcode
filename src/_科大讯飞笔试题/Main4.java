package _科大讯飞笔试题;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str = in.nextLine();
            String str1 = str.trim();
            System.out.println(help(str1));
        }
    }

    public static String help(String str){
        StringBuilder sb = new StringBuilder();
        if(str.charAt(0)=='-')
            sb.append('-');
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                sb.append(str.charAt(i));
        }
        if(sb.length()==0)
            return String.valueOf('0');

            return sb.toString();
    }
}