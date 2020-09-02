package 剑指offer._15二进制中的1;

public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;//把n的2进制形式往右推一位
        }
        return count;
    }

}