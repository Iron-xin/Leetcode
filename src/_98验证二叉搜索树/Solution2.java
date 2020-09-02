package _98验证二叉搜索树;
//这个写法非常烂 但是思路还算清晰 我改动别人的
public class Solution2 {
    long cur = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }
    private boolean inOrder(TreeNode root){
        if(root==null)
            return true;

        boolean left = isValidBST(root.left);
        if(left!=true){
            return false;
        }
        if (cur >= root.val) return false;
        cur = root.val;

        boolean right = isValidBST(root.right);
        return right;

    }
}
