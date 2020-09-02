package _07整数反转;

public class Solution {
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        //long类型转换成Int，如果溢出就不等于自己，则返回零
        return (int)n==n? (int)n:0;
    }
}
