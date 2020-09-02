package 剑指offer._16数值的整数次方;

public class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        double temp = x;
        int exp = n;
        while (exp != 0) {
            if ((exp % 2) != 0) {
                ans = ans * temp;
            }
            temp = temp * temp;
            exp /= 2;
        }
        return n > 0 ? ans : 1 / ans;
    }
}
