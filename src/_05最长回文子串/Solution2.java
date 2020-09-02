package _05最长回文子串;

class Solution2 {
    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        int left = 0;//中心扩散的左边界
        int right = 0;//中心扩散的右边界
        int len = 1;//记录扩散的整个子串的长度 局部最长
        int maxStart = 0;//全局的最长回文子串的左边界
        int maxLen = 0;//全局的最长回文子串的长度
        //每个字符都作为中心扩散，外层n次循环。
        for (int i = 0; i < s.length(); i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                //左边相邻的和i相同，更新为左侧
                len++;
                left--;
            }
            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                //右边相邻的和i相同，更新右侧边界
                len++;
                right++;
            }
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                //左右两侧都和i不相等，那就比较两侧了
                len = len + 2;
                left--;//这里会让left记录成不是回文的边界情况，所以后面需要+1才是真正的边界
                right++;
            }
            if (len > maxLen) {//当前比较的子回文串和之前记录的最大值进行比较
                maxLen = len;
                maxStart = left;
            }
            len = 1;//需要重新改为长度1.
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);//拿到的maxStart+1才是左边界 因为MaxStart多减了一个1
    }
}