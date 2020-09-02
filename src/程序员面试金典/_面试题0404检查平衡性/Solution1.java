package 程序员面试金典._面试题0404检查平衡性;

public class Solution1 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return flag;
    }

    private int depth(TreeNode root) {//这是求深度的
        if(root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);

        if(left>right+1 || right>left+1)
            flag = false;
        //应该返回左右深度中较大的一个，并且深度要+1
        return left>right?left+1:right+1;
    }
}
