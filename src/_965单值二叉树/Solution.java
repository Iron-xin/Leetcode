package _965单值二叉树;

import java.util.LinkedList;
import java.util.Queue;

//很多中解法，就是树的递归过程中，加入值的比较。这里就记录一个层序遍历
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.val != root.val){
                return false;
            }
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return true;
    }
}