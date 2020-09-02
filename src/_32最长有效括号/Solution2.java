package _32最长有效括号;
//在这种方法中，我们利用两个计数器 leftleft 和 rightright 。首先，我们从左到右遍历字符串，
//        对于遇到的每个‘(’，我们增加 leftleft 计算器，
//        对于遇到的每个‘)’，我们增加 rightright 计数器。
//        每当 leftleft 计数器与 rightright 计数器相等时，我们计算当前有效字符串的长度，并且记录目前为止找到的最长子字符串。
//        如果 rightright 计数器比 leftleft 计数器大时，我们将 leftleft 和 rightright 计数器同时变回 00 。


public class Solution2 {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
}
