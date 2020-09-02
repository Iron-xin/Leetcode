package _225用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private int tail;
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<Integer>();
    }

    public void push(int x) {
        tail = x;
        q.add(x);
    }
    /**
     * Removes the element on top of the stack and returns that element.
     * 出栈的时间复杂度为 n
     */
    public int pop() {
        int size = q.size();//每次都把队尾元素前面的所有的元素都出队后再添加到队列中
        for (int i = 0; i < size - 2; i++)
            q.add(q.remove());
        tail = q.remove(); // 堆顶第二个元素 让下次调用top时使用
        q.add(tail);
        return q.remove();
    }

    public int top() {
        return tail;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}