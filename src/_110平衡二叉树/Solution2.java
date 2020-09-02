package _110平衡二叉树;

//剪枝
public class Solution2 {
    boolean isBalanced=true;
    public boolean isBalanced(TreeNode root) {
        TreeDepth(root);
        return isBalanced;
    }

    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left=TreeDepth(root.left);
        if (left == -1) return -1;
        int right=TreeDepth(root.right);
        if (right == -1) return -1;
        if(left-right>1 || right-left>1){
            isBalanced=false;
            return -1;
        }
        return left>right?left+1:right+1;
    }
}