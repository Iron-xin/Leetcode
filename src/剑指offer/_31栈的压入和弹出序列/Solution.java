package 剑指offer._31栈的压入和弹出序列;

import java.util.Stack;

public class Solution {
    // 比较压入序列、弹出序列是否相等，如果相等则while环节
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0 ;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while( stack.isEmpty() == false && stack.peek() == popped[popIndex]){
                popIndex ++ ;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}