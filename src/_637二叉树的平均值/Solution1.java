package _637二叉树的平均值;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution1 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        double sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return res;
        queue.offer(root);
        int count = 0;
        int nextcount = 1;

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            sum = sum+node.val;

            count++;
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right !=null)
                queue.offer(node.right);
            if(count == nextcount){
                res.add(sum/nextcount);
                nextcount = queue.size();
                count = 0;
                sum=0;
            }
        }
        return res;
    }
}
