package _461海明距离;

public class Solution {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        int count = 0;
        while (i != 0) {
            //按位与
            if ((i & 1) == 1) {
                count++;
            }
            //右移1位，相当于除以2
            i = i >> 1;
        }
        return count;
    }
}

