package 剑指offer._27二叉树的镜像;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
            queue.offer(node.right);
        }
        return root;
    }
}