package _1309解码字母到整数映射;

public class Solution {
    public String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();

        int len = s.length();
        for(int i = 0; i < len; i++) {
            int num = s.charAt(i) - '0';//a要变成1. a的码表是97而1码表是49 。这里减一个48就转变成了对应的数字
            if(i < len - 2) {
                if(s.charAt(i+2) == '#') {
                    num = num * 10 + s.charAt(i+1)- '0';
                    i = i + 2;//跳到#位置
                }
            }
            sb.append((char)(num + 'a' - 1));
            //这里num-1相当于对1的增加量，也相当于是对a的增加量，因此a+num-1就是对应的字符
        }
        return sb.toString();
    }
}