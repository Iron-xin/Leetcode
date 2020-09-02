package _20有效的括号;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        //首先先用map将这些东西存起
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
//某一个优化是，如果长度时奇数，可以直接认为是不可行的。
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            //栈为空，添加，不为空，判断，重合，弹出，否则，入栈。进行下一个字符的比较
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if (stack.peek() == map.get(s.charAt(i))){
                stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}