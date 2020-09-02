package _00背包问题;

import java.util.*;


public class Main {
    /**
     * 找到比输入的整数大的下一个水仙花数
     * @param n int整型 输入的整数
     * @return long长整型
     */
    public static long nextNarcissisticNumber (int n) {
        // write code here
        if(n<9)
            return (long)n+1;
        if(n<153)
            return (long)153;
        if(n<370)
            return (long)370;
        if(n<371)
            return (long)371;
        if(n<407)
            return (long)407;
        if(n<1634)
            return 1634;
        if(n<8208)
            return 8208;
        if(n<9474)
            return 9474;
        if(n<54748)
            return 54748;
        if(n<92727)
            return 92727;
        if(n<93084)
            return 93084;
        if(n<548834);
            return 548834;
    }


    public static void main(String[] args){
        System.out.println(nextNarcissisticNumber(108));
    }
}