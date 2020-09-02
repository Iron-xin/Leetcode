package 剑指offer._65不用加减乘除做加法;

public class Solution {
    public int add(int a, int b) {
        while(b != 0){
            int temp = a ^ b; //除去相加位需要进位
            b = (a & b) << 1; //进位
            a = temp;
        }
        return a;
    }
}
