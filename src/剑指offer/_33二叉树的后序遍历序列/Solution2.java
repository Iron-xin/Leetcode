package 剑指offer._33二叉树的后序遍历序列;

import java.util.Stack;

public class Solution2 {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root)
                return false;
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                //root记录当前i位置为左子树时，i的父节点 所以我们要保证，i位置以前的数都小于当前根节点
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
}


