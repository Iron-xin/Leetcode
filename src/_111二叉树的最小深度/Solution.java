package _111二叉树的最小深度;

public class Solution {

    public int minDepth(TreeNode root) {

        return help(root);
    }
    public int help(TreeNode root){
        if(root == null)
            return 0;

        int left = help(root.left);
        int right = help(root.right);
        //当有一边的子树为null时，就不予判断，所有+1就是直接加的根节点
        if(root.left!=null && root.right==null)
            return left+1;
        if(root.right!=null && root.left ==null)
            return right+1;
        //因此，下面这个return其实有个隐含条件，就是左右子树都不为空  （其实都为空时+1也是正确的）
        return Math.min(left,right)+1;
    }
}
//下面是直接改的，并不能通过所有案例
//public class Solution {
//    public int minDepth(TreeNode root) {
//        return help(root);
//    }
//    public int help(TreeNode root){
//        if(root == null)
//            return 0;
//        int left = help(root.left);
//        int right = help(root.right);
//        return Math.min(left,right)+1;
//    }
//}
