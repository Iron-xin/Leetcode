package _230二叉搜索树中第K小的元素;

import java.util.Stack;

public class Solution2 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int num = 0;
        int res = -1;
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            // 节点不为空一直压栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left; // 考虑左子树
            }
            // 节点为空，就出栈
            cur = stack.pop();
            // 当前值加入
            num++;
            if (num == k) {
                res = cur.val;
                break;
            }
            // 考虑右子树
            cur = cur.right;
        }
        return res;
    }
}