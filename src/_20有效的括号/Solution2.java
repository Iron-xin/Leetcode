package _20有效的括号;

import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        for(int i =0; i<ch.length;i++ ){
            if(ch[i]=='(')
                stack.push(')');
            else if(ch[i]=='[')
                stack.push(']');
            else if(ch[i]=='{')
                stack.push('}');
            else if(stack.isEmpty()||ch[i]!=stack.pop())//这里将peek和Pop放在一起弄了
                return false;
        }
        return stack.isEmpty();
    }
}