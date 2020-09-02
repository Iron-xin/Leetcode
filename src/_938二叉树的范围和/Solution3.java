package _938二叉树的范围和;


import java.util.Stack;

public class Solution3 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        int result = 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp = null;
        while(!stack.isEmpty()){
            temp = stack.pop();
            if(temp.val >= L && temp.val <= R){
                result += temp.val;
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
            if(temp.right != null){
                stack.push(temp.right);
            }
        }
        return result;
    }
}