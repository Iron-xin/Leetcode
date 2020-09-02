package _104二叉树的深度;

public class Solution1 {
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        int max =0;
        if(root == null)
            return 0;
        if(root.left != null) {
            left = maxDepth(root.left) ;

        }
        if(root.right!=null){
            right = maxDepth(root.right);
        }
        max = Math.max(left,right)+1;
        return max;
    }
}