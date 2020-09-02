package 剑指offer._62圆圈中最后剩下的数字;

public class Solution {
    public int lastRemaining(int n, int m) {
        if(n<1 || m<1)
            return -1; //出错
        int last = 0;
        for(int i = 2; i<=n; i++){
            last = (last+m)% i;  //这里是i不是n！！！
        }
        return last;
    }
}