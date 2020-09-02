package _五八同程;

import java.util.*;


public class Main {
    /**
     *
     * @param a int整型
     * @param b int整型
     * @return int整型
     */
    public static int question (int a, int b) {
        // write code here
        if(a>b)
            question(b,a);
        int ans = 0;
        for(int i=0;i<29;i++){
            for(int j=i+1;j<30;j++){
                if((i<29&&j<30)&&(j*j-i*i) == (b-a)  && (i*i)>a  && (j*j) >b)
                    return i*i-a;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(question(100,200));
    }
}