package _10正则表达式匹配;

public class Solution1 {
    public boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        if (str == null || pattern == null)
            return false;
        return matchCore(str, 0, pattern, 0);

    }
    private boolean matchCore(char[] str, int s, char[] pattern, int p) {
        //下面4行是递归结束标志，两个指针都指到了最后，才是匹配，否则不匹配
        if (s == str.length && p == pattern.length)
            return true;
        if (s < str.length && p == pattern.length)
            return false;

        //虽然比的是P位置的，但是P后面出现*时，规则需要改变。
        if (p + 1 < pattern.length && pattern[p + 1] == '*') {
            //出现了*，并且s和P指向的相同，3种情况并列
            if ((s < str.length && pattern[p] == '.')
                    || (s < str.length && pattern[p] == str[s])) {
                return matchCore(str, s, pattern, p + 2)
                        || matchCore(str, s + 1, pattern, p);
//                        || matchCore(str, s + 1, pattern, p + 2);//第三种可以不要
            } else {//出现了*，并且s和p指向的不同，那就把*前面的字符理解出现了0次，p+2
                return matchCore(str, s, pattern, p + 2);
            }
        }
        //说明P后面不是*，那么就进行常规判断。相同就分别给指针+1
        if (s < str.length && (pattern[p] == str[s] || pattern[p] == '.'))
            return matchCore(str, s + 1, pattern, p + 1);
        //p后面又不是*，也没有.给你撑腰，你还敢出现不同，那必然false
        return false;
    }
}
//下面是不转换成char数组的写法
//public class Solution {
//    public boolean isMatch(String s, String p) {
//        int ns = s.length(), np = p.length();
//        if (ns == 0 && np == 0) {
//            return true;
//        }
//        if (ns != 0 && np == 0) {
//            return false;
//        }
//        if (ns == 0) {
//            if ((np & 1) == 1) {
//                return false;
//            }
//            int i = 1;
//            while (i < p.length() && p.charAt(i) == '*') {
//                i += 2;
//            }
//            return i == p.length() + 1;
//        }
//        if (s.charAt(ns - 1) == p.charAt(np - 1) || p.charAt(np - 1) == '.') {
//            return isMatch(s.substring(0, ns - 1), p.substring(0, np - 1));
//        }
//        if (p.charAt(np - 1) == '*') {
//            if (s.charAt(ns - 1) != p.charAt(np - 2) && p.charAt(np - 2) != '.') {
//                return isMatch(s, p.substring(0, np - 2));
//            }
//            return isMatch(s.substring(0, ns - 1), p) || isMatch(s, p.substring(0, np - 1))
//                    || isMatch(s, p.substring(0, np - 2));
//        }
//        return false;
//    }
//}