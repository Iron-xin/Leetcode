package _华为机试OJ._71字符串通配符;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String pattern = scan.nextLine();
            String target = scan.nextLine();
            System.out.println(match(pattern, target, 0, 0));
        }

    }

    public static boolean match(String pattern, String target, int index1,
                                int index2) {
        if (index1 == pattern.length() && index2 == target.length()) {
            return true;
        }
        if (index1 >= pattern.length() || index2 >= target.length()) {
            return false;
        }
        if (pattern.charAt(index1) == '?') {
            return match(pattern, target, index1 + 1, index2 + 1);
        } else if (pattern.charAt(index1) == '*') {
            // 匹配0个一个或者多个
            return match(pattern, target, index1 + 1, index2)
                    || match(pattern, target, index1 + 1, index2 + 1)
                    || match(pattern, target, index1, index2 + 1);
        } else if (pattern.charAt(index1) == target.charAt(index2)) {
            return match(pattern, target, index1 + 1, index2 + 1);
        }
        return false;
    }
}