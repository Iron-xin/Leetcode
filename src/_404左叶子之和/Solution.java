package _404左叶子之和;

public class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        if(root.left!=null&&root.left.left==null && root.left.right == null )
            sum = sum+root.left.val;
        return sum;
    }
}