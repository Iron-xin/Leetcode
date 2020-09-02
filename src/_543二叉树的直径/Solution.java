package _543二叉树的直径;

public class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            //遍历每一个节点,求出此节点作为根的树的深度,那么,左子树深度加右子树深度的最大值即是答案
            depth(root);
            return max;
        }
        return 0;
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;

        int right = depth(root.right);
        int left = depth(root.left);
        if (right + left > max)
            max = right + left;
        return Math.max(right, left) + 1;

    }
}