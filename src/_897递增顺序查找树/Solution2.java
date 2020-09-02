package _897递增顺序查找树;

import java.util.Stack;

public class Solution2 {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = new TreeNode(-1);
        TreeNode head = res;
        if(root == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() ||node !=null){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                TreeNode n = new TreeNode(node.val);
                res.right = n;
                res = res.right;
                node = node.right;
            }
        }
        return head.right;
    }
}
