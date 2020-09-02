package _1374生成每种字符都是奇数个的字符串;

public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {//偶数就添加一个a变成奇数
            sb.append('a');
            n--;
        }
        //是奇数就全部添加b
        for (int i = 0; i < n; i++)
            sb.append('b');
        return sb.toString();
    }
}