package _华为机试OJ._81字符串匹配;

import java.util.Scanner;
public class Main {
    public static boolean help(String shortString, String longString){
        int[] bucket = new int[128];
        for (int i = 0; i < longString.length(); i++)  //桶 统计频率，某个字符出现频率不为0
            bucket[longString.charAt(i)]++;
        for (int i = 0; i < shortString.length(); i++) {  //短字符串各个字符在长字符串各个字符频率情况
            if(bucket[shortString.charAt(i)] == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String strShort = sc.nextLine();//显然这里用next也是可以的
            String strLong = sc.nextLine();
            System.out.println(help(strShort, strLong));
        }
    }
}