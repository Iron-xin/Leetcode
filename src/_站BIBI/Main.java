package _站BIBI;

import java.util.Stack;

public class Main {
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean IsValidExp (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(')');

            }else if(s.charAt(i) == '['){
                stack.push((']'));

            }else if(s.charAt(i) == '{')
                stack.push('}');
            else if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
                stack.pop();
            }else
                return false;

        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}