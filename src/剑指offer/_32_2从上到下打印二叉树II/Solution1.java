package 剑指offer._32_2从上到下打印二叉树II;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
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
                list.add(temp);
                temp = new LinkedList<>();//每次都必须新建一个
                nextcount = queue.size();
                count = 0;
            }
        }
        return list;
    }
}
