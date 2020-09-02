package _98验证二叉搜索树;

import java.util.Stack;

public class Solution3 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        long pre = Long.MIN_VALUE;
        int a = Integer.MIN_VALUE;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= pre)
                return false;
            pre = root.val;
            root = root.right;
        }
        return true;
    }
}