package _696计数二进制子串;

public class Solution {
    public int countBinarySubstrings(String s) {
        // pre 前一个数字连续出现的次数，cur 当前数字连续出现的次数，result 结果子串个数
        int pre = 0, cur = 1, result = 0;
        int len = s.length() - 1;//边界，因为之后会有i+1
        for (int i = 0; i < len; i++) {
            // 判断当前数字是否与后一个数字相同
            if (s.charAt(i) == s.charAt(i+1)) { // 相同，则当前数字出现的次数cur加1
                cur++;
            } else { // 不同，则当前数字事实上变成了前一个数字，当前数字的次数重置为1
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) { // 前一个数字出现的次数 >= 后一个数字出现的次数，则一定包含满足条件的子串
                result++;
            }
        }
        return result;
    }
}
