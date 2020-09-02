package 剑指offer._28对称的二叉树;

public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return  isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q ==null)
            return true;
        if(p==null)
            return false;
        if(q==null)
            return false;
        return p.val==q.val && isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
}
