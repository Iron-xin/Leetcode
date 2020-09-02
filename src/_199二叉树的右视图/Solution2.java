package _199二叉树的右视图;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return list;
        queue.offer(root);
        int count = 0;
        int nextcount = 1;

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            count++;
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right !=null)
                queue.offer(node.right);
            if(count == nextcount){
                list.add(node.val);
                nextcount = queue.size();
                count = 0;
            }
        }
        return list;
    }
}