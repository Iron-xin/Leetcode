package _102二叉树的层序遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int count =0;
        int curcount = 1;
        List<Integer> list = new LinkedList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            count++;
            list.add(node.val);
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right!=null)
                queue.offer(node.right);
            if(count==curcount){
                curcount=queue.size();
                count=0;
                res.add(list);
                list = new LinkedList<>();
            }
        }
        return res;
    }
}
