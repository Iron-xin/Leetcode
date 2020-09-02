package _09回文数;

public class Solution {
    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        //
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            //如1221，div是1000
            int left = x / div;
            int right = x % 10;
            if (left != right)
                return false;
            //比如刚开始是1221的两个1比较，现在要算出22出来，怎么处理让x变成22呢
            //所以除以100和模div是真的很巧妙
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
