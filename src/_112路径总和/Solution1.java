package _112路径总和;

public class Solution1 {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        help(root,sum);
        return flag ;
    }
    public boolean help(TreeNode root,int sum){
        if(root==null)
            return false;
        help(root.left,sum-root.val);
        help(root.right,sum-root.val);
        if(sum==root.val && root.left==null &&root.right==null)
            flag = true;
        return false;
    }

}
