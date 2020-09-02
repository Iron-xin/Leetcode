package 剑指offer._32_2从上到下打印二叉树II;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return list;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right !=null)
                    queue.offer(node.right);
            }
            list.add(temp);
        }
        return list;
    }
}