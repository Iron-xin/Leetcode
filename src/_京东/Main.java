package _京东;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(jingdong(a));
        }
    }
    public static int jingdong(int n) {
        int ans = 0;
        StringBuilder st = new StringBuilder();


        if(n>12 && n<=3*3*3+12){

            if(((n-13)/9 <1))
                st.append(2);

            else if((n-13)/9 <2)
                st.append(3);

            else if((n-13)/9 <3)
                st.append(5);

            n = n-(n/9)*9;
        }


        if(n>3 && n<=3*3+3){

                if(((n-4)/3 <1))
                    st.append(2);

                 else if((n-4)/3 <2)
                    st.append(3);

                else if((n-4)/3 <3)
                    st.append(5);

            n = n-(n/3)*3;
        }


        if(n<=3){
            if(n%3==1){
                st.append(2);
            }
            if(n%3==2){
                st.append(3);
            }
            if(n%3==0){
                st.append(5);
            }
        }

        return  Integer.valueOf(st.toString());
    }

}