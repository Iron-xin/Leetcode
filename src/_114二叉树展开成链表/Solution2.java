package _114二叉树展开成链表;

import java.util.Stack;
//先序遍历的写法
public class Solution2 {
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        TreeNode pre = null;
        while (!s.isEmpty()) {
            TreeNode temp = s.pop();

            if(pre!=null){
                pre.right = temp;
                pre.left = null;
            }

            if (temp.right != null){
                s.push(temp.right);
            }
            if (temp.left != null){
                s.push(temp.left);
            }

            pre = temp;

        }
    }
}
