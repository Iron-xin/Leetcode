package _1281整数的各位积和之差;

public class Solution {
    public int subtractProductAndSum(int n){
        int a =1;
        int b =0;


        while (n > 0) {
            a = a * (n % 10);
            b = b + (n % 10);
            n = n / 10;
        }

        return (a - b);
    }
}
