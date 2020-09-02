package _739每日温度;

import java.util.Stack;

public class Solution2 {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            //栈是单调栈，栈底索引对应的元素最大，栈顶最小。栈中记录索引。
            //栈顶是当前遍历的最小的，当出现比栈顶元素大的数时，说明栈顶那个数右边第一个比他大的数出现了。
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            //当前数更大，或者操作完了，就得入栈
            stack.push(i);
        }
        return ret;
    }

}