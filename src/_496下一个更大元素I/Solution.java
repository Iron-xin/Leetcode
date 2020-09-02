package _496下一个更大元素I;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = nums2.length - 1; i >= 0; i--)
        {
            int n = nums2[i];
            //可以看到，栈顶是最小的元素，当前元素比栈大，就会弹出后在入栈，否则直接入栈
            while(!stack.isEmpty() && n >= stack.peek())
                stack.pop();
            if(stack.isEmpty())
                map.put(n, -1);//没有比这个数更大，map就记录-1
            else
                map.put(n, stack.peek());//否则就记录比这个数大的数
            stack.push(n);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i < ans.length; i++)
            ans[i] = map.get(nums1[i]);//然后从map中取出来
        return ans;
    }
}
