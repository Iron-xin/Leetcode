package _华为机试OJ._104字符串分割;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
//            sc.nextLine();
            for(int i=0; i<n; i++) {
//                String temp1 = sc.nextLine();//这里不能用nextline，
                //这是因为上面的n读取后，换行是有效的，因此第一次读行，会去读n后面的换行，如果想正常运行，则在n后面补一行
                String temp = sc.next();
                while(temp.length()%8!=0) {
                    temp += "0";
                }
                for(int j=0; j<temp.length(); j+=8) {
                    System.out.println(temp.substring(j, j+8));
                }
            }
        }
    }
}
