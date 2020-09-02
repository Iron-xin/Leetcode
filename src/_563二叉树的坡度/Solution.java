package _563二叉树的坡度;

public class Solution {
    int ans = 0;
    public int findTilt(TreeNode root) {
        help(root);
        return ans;
    }
    public int help(TreeNode root){
        if(root == null)
            return 0;
        int left = help(root.left);//Left表示左子树节点之和
        int right = help(root.right);
        ans = ans+Math.abs(left-right);//坡度是左右节点之和的差，并累计
        //因此，应该返回的是当前子树的所有和
        return left+right+root.val;
    }
}