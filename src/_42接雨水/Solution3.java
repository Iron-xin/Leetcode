package _42接雨水;

import java.util.Stack;

public class Solution3{
    public int trap(int[] height) {
        if (height == null) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int curIdx = stack.pop();
                //当新来的比栈底大时，进入第一个while
                //下面是统计某个值是否出现多次，出现多次可以统一处理
                //所以下面的这个while可以不运行的
                while (!stack.isEmpty() && height[stack.peek()] == height[curIdx]) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    int stackTop = stack.peek();//取一个栈顶元素，之前弹出了一个栈顶了
                    //看这个栈顶和当前加入的i谁更小，因为i位置是有可能是局部较大值
                    //取小的，然后和弹出的栈顶作差，就是某个雨滴数量，但是需要乘上一个距离，那就是当前较大值i减栈顶再减1.
                    ans += (Math.min(height[stackTop], height[i]) - height[curIdx]) * (i - stackTop - 1);
                }
            }
            //最终处理完或者不处理都应该入栈
            stack.add(i);
        }
        return ans;
    }
}