package _114二叉树展开成链表;

import java.util.Stack;

public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            if (!stack.isEmpty()){
                TreeNode node = stack.pop();
                TreeNode tmp = node.right;
                node.right = node.left;
                node.left = null;

                while(node.right != null) node = node.right;
                node.right = tmp;
                root = tmp;
            }
        }
    }
}
