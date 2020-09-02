package _191位1的个数;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count ++;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        while(n != 0){
            if((n%2)==1||(n%2)==-1)
                count++;
            n /= 2;
        }
        return count;
    }
}
