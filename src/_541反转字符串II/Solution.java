package _541反转字符串II;

public class Solution {
    public String reverseStr(String s, int k) {
        // n轮2k剩余部分，单独处理
        int rest = s.length() % (2 * k);
        // n轮2k
        int turn = s.length() / (2 * k);
        StringBuilder sb = new StringBuilder();
        // 对每轮的2k进行处理
        for(int i = 0; i < turn; i++) {
            // 每轮2k开始的不同起点
            int baseLine = i * 2 * k;
            // 一轮2k里反转前k个
            for(int a = k-1; a >=0; a--) {
                char ch = s.charAt(baseLine + a);
                sb.append(ch);
            }
            // 一轮2k里剩余k个加入sb中
            for(int b = k; b < 2 * k; b++) {
                char ch = s.charAt(baseLine + b);
                sb.append(ch);
            }
        }
        // n轮2k正好处理完，则直接返回sb
        if(rest == 0) {
            return sb.toString();
        } else {
            // 若有额外剩余，则对数量进行不同的处理
            // 小于k，全反转
            if(rest < k) {
                int baseLine = turn * 2 * k;
                for(int i =rest-1; i>=0; i--) {
                    char ch = s.charAt(baseLine + i);
                    sb.append(ch);
                }
            } else {
                // 大于k，则反转前k个，剩余部分照抄
                int baseLine = turn * 2 * k;
                for(int i = k-1; i >=0; i--) {
                    char ch = s.charAt(baseLine + i);
                    sb.append(ch);
                }
                String subString = s.substring(baseLine + k);
                sb.append(subString);
            }
        }
        return sb.toString();
    }
}