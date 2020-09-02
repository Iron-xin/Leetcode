package 剑指offer._55_1二叉树的深度;

//刚开始想的递归，实际上至少需要两个变量，一个是左树一个是右树的深度，还可以用一个全局变量，即3个变量。这样代码才容易写。
public class Solution1 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}