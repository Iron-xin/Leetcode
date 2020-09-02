package _32最长有效括号;

import java.util.Stack;
//（）（（） 这种情况要注意。最好用下标来记录。否则还要回溯。
public class Solution1 {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        //System.out.println(stack);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {//i就是从当前某个起始位置算起
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                int temp = stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                else {
                    res = Math.max(res, i - stack.peek());//此时的栈顶，是较长有效括号的前一位了。
                    //res = Math.max(res, i - temp+1);//这样的写法更容易理解，temp就是有效括号的第一位的索引
                    //但是这个写法是错误的，如果是()(()()这样的，temp会记录错误，记录的是索引为5，而不是索引为2的左括号。
                }
            }
        }
        return res;
    }

}

