package _华为机试OJ._102字符统计;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int[] asii = new int[200];
            String s = cin.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int n = (int) c;
                asii[n]++;
            }

            int max = 0;
            for (int i = 0; i < 200; i++) {
                if (asii[i] > max) {
                    max = asii[i];
                }
            }

            while (max != 0) {
                for (int i = 0; i < 200; i++) {
                    if (asii[i] == max) {
                        System.out.print((char) i);
                    }
                }
                max--;
            }
//            System.out.println();
        }
    }
}