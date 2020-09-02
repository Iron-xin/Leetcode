package _538把二叉搜索树转换成累加树;
//注意sum设置为全局变量后，下面的不能设计成 public TreeNode help(TreeNode root，int sum)
//否则起作用的是每次新产生的一个sum，而不是全局的sum在起作用。
public class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return null;
        TreeNode node = root;
        help(root);
        return node;
    }

    public TreeNode help(TreeNode root){
        if(root == null)
            return null;
        help(root.right);
        root.val = sum+root.val;
        sum = root.val;
        help(root.left);
        return root;
    }
}
