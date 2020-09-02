package _236二叉树的最近公共祖先节点;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right != null)
            return root;
        if (left == null)
            return right;
        //同上
        if (right == null)
            return left;

        return null;
    }
}
