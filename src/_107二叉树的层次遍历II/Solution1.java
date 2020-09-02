package _107二叉树的层次遍历II;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return list;
        queue.offer(root);
        int count = 0;
        int nextcount = 1;
        List<Integer> temp = new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            temp.add(node.val);
            count++;
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right !=null)
                queue.offer(node.right);
            if(count == nextcount){
                stack.push(temp);
                temp = new LinkedList<>();//每次都必须新建一个
                nextcount = queue.size();
                count = 0;
            }
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}