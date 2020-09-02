package _112路径总和;

import java.util.Stack;

public class Solution2 {
    int res = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        res = sum;
        if(root == null)
            return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        res = res-root.val;
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();

            if(res==0 &&temp.left==null &&temp.right==null)
                return true;
            res = res+temp.val;
            if(temp.left!=null){
                stack.push(temp.left);
                res = res-temp.val;
            }
            if(temp.right!=null) {
                stack.push(temp.right);
                res = res-temp.val;
            }
        }
        return false;
    }
}