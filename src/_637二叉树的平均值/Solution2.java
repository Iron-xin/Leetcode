package _637二叉树的平均值;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        double sum =0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right !=null)
                    queue.offer(node.right);
            }
            res.add(sum/size);
            sum = 0;
        }
        return res;
    }
}
