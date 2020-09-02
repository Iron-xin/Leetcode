package _617合并二叉树;

public class Solution3 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        TreeNode temp = t1;//此时都不为空
        help(temp, t2);
        return t1;
    }

    private TreeNode help(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.left = help(t1.left, t2.left);
        t1.right = help(t1.right, t2.right);
        t1.val += t2.val;
        return t1;
    }
}
//class Solution {
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if(t1 == null)  return t2;
//        if(t2 == null)  return t1;
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left, t2.left);
//        t1.right = mergeTrees(t1.right, t2.right);
//        return t1;
//    }
//}
