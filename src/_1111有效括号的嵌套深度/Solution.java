package _1111有效括号的嵌套深度;

public class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int len = seq.length();
        int[] ans = new int[len];
        int depth = 0;
        for (int i = 0; i < len; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                if ((depth & 1) == 0)
                    ans[i] = 1;
            } else { //此时是右括号  当左右括号的深度奇偶性相同时，就赋值为等同的1.
                if ((depth & 1) == 0)
                    ans[i] = 1;
                depth--;
            }
        }
        return ans;
    }
}