package _101对称二叉树;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root ==null)
            return true;
        return help(root.left,root.right);

    }
    public boolean help(TreeNode root1,TreeNode root2){
        if(root1 == null && root2==null)
            return true;
        if(root1 == null)
            return false;
        if(root2 == null)
            return false;

        return (root1.val == root2.val)&&help(root1.left,root2.right)&&help(root1.right,root2.left);
    }
}