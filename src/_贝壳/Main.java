package _贝壳;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            String str = in.next();
            System.out.println(helper1(str));
        }
    }

    private static int helper1(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        int count = 0;
        while(left<right){
            if(ch[left] != ch[right])
                count++;
            left++;
            right--;
        }
        return count;
    }
}
