package _783二叉搜索树的最小距离;

import java.util.Stack;

public class Solution2 {

    public int minDiffInBST(TreeNode root) {
        if(root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = new TreeNode(Integer.MAX_VALUE);//记录前一个节点 这么赋值是为了空指针异常
        //这里也可以赋值为null，但是后面的res那一行代码，就要用一个if判断，如果pre是Null，就不计算本次。
        int res = Integer.MAX_VALUE;

        while(!stack.isEmpty()||root!=null) {
            if (root!=null) {
                stack.push(root);
                root=root.left;
            }
            else {
                root=stack.pop();

                res = Math.min(res, Math.abs(root.val - pre.val));
                pre = root;

                root=root.right;
            }
        }
        return res;
    }
}
