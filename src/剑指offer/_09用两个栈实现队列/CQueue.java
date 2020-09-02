package 剑指offer._09用两个栈实现队列;

import java.util.Stack;

public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);//永远往栈1压元素
    }

    public int deleteHead() {
        if(stack1.empty()&&stack2.empty()){
            return -1;
        }
        if(stack2.isEmpty()){ //栈2为空，就需要倒一手，不为空就直接弹，跳到return进行弹
            while(!stack1.isEmpty()){
                //栈2已经空了想取元素，就得把元素全部倒给栈2，直到栈1是空
                stack2.push(stack1.pop()); //把栈1的弹出，全部放入栈2
            }
        }
        return stack2.pop();
    }
}