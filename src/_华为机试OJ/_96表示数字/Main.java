package _华为机试OJ._96表示数字;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            MarkNum(str);
//            MarkNum2(str);
        }
    }

    //方法1：stringbuilder
    public static String MarkNum(String pInStr)
    {
        char[] chs = pInStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chs.length;i++){
            if((chs[i]-'0'>=0) && (chs[i]-'0'<=9)){
                sb.append("*"+chs[i]+"*");
            }else {
                sb.append(chs[i]);
            }
        }
        System.out.println(sb.toString().replace("**",""));
        return null;
    }

    //方法2：正则表达式
    public static String MarkNum2(String pInStr)
    {
        pInStr = pInStr.replaceAll("(\\d+)","\\*$1\\*");
        System.out.println(pInStr);
        return null;
    }
}
