package _538把二叉搜索树转换成累加树;

import java.util.Stack;
//中序遍历的写法
public class Solution2 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //stack.add(root);
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            while(node!= null){
                stack.add(node);
                node = node.right;
            }
            node = stack.pop();
            node.val += sum;
            sum = node.val;
            if(node.left != null)
                node = node.left;
            else
                node = null;
            //上面四句用一句代替
            //node = node.left;
        }
        return root;
    }
}