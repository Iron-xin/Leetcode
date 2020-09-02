package _101对称二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> leftTree = new LinkedList<>();
        Queue<TreeNode> rightTree = new LinkedList<>();
        //两个树的根节点分别加入
        leftTree.offer(root.left);
        rightTree.offer(root.right);
        while (!leftTree.isEmpty() || !rightTree.isEmpty()) {
            TreeNode curLeft = leftTree.poll();
            TreeNode curRight = rightTree.poll();
            if (curLeft == null && curRight != null || curLeft != null && curRight == null) {
                return false;
            }
            if (curLeft != null && curRight != null) {
                if (curLeft.val != curRight.val) {
                    return false;
                }
                //先加入左子树后加入右子树
                leftTree.offer(curLeft.left);
                leftTree.offer(curLeft.right);

                //先加入右子树后加入左子树
                rightTree.offer(curRight.right);
                rightTree.offer(curRight.left);
            }

        }
        return true;
    }

}