package _华为机试OJ._84统计大写字母;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int cnt = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    cnt ++;
                }
            }
            System.out.println(cnt);
        }
    }
}
